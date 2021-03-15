package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    //INSERT
    public void insertActivity(Activity activity){
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps =
                        conn.prepareStatement("INSERT INTO activities(start_time, activity_desc, activity_type) VALUES (?,?,?)")){
            ps.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            ps.setString(2, activity.getDesc());
            ps.setString(3, activity.getType().toString());
            ps.executeUpdate();
        } catch (SQLException se){
            throw new IllegalStateException("Can not insert", se);
        }
    }


    //SELECT előállítása - paraméter nélkül
    public List<Activity> selectAllActivities(){
        try (Connection conn = dataSource.getConnection();
                PreparedStatement pst = conn.prepareStatement("SELECT * FROM activities")) {

            //A ResultSet külön metódusba kiszervezve!
            return selectByPreparedStatement(pst);

        }catch (SQLException se){
            throw new IllegalStateException("Cannot select employees", se);
        }
    }


    //SELECT előállítása - paraméterrel
    public List<Activity> selectActivitiesByType(ActivityType type){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM activities WHERE activity_type = ?")) {
            pst.setString(1, type.toString());

            //A ResultSet külön metódusba kiszervezve!
            return selectByPreparedStatement(pst);

        }catch (SQLException se){
            throw new IllegalStateException("Cannot select", se);
        }
    }


    //SELECT előállítása - paraméterrel
    public Activity selectById(long id){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM activities WHERE id = ?")) {
            pst.setLong(1, id);

            //A ResultSet külön metódusba kiszervezve!
            List<Activity> activities = selectByPreparedStatement(pst);

            if(activities.size()==1){
                return activities.get(0);
            }
            throw new IllegalArgumentException("Not found");
        }catch (SQLException se){
            throw new IllegalStateException("Cannot select", se);
        }
    }



    //SELECT-ek végrehajtása!
    private List<Activity> selectByPreparedStatement(PreparedStatement pst) {

        List<Activity> activities = new ArrayList<>();
        try (ResultSet rs = pst.executeQuery()) {
            while (rs.next()){
                Activity activity = new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));
                activities.add(activity);
            }
            return activities;
        }catch (SQLException sqle){
            throw new IllegalStateException("Cannot query", sqle);
        }
    }

}
