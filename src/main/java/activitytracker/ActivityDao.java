package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    //INSERT - Generált azonosító lekérdezésével
    public Activity insertActivity(Activity activity){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pst = conn.prepareStatement("INSERT INTO activities(start_time, activity_desc, activity_type) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS))
        {
            pst.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            pst.setString(2, activity.getDesc());
            pst.setString(3, activity.getType().toString());
            pst.executeUpdate();

            //Új metódusba kiszervezve, aminek átadom az insertált Activity-t és az visszaadja ugyanezt az Activity-t csak már a generált id-jával!
            return executeAndGetGeneratedKey(pst, activity);

        } catch (SQLException se){
            throw new IllegalStateException("Can not insert", se);
        }
    }

    //Generált id-megkapása getGeneratedKeys metódussal
    private Activity executeAndGetGeneratedKey(PreparedStatement stmt, Activity activity) {
        try (
                ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                long id = rs.getLong(1);
                return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
            } else {
                throw new SQLException("No key has generated");
            }
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }


    //SELECT előállítása - paraméter nélkül
    public List<Activity> selectAllActivities(){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM activities"))
        {
            //A ResultSet külön metódusba kiszervezve!
            return selectByPreparedStatement(pst);

        }catch (SQLException se){
            throw new IllegalStateException("Cannot select employees", se);
        }
    }


    //SELECT előállítása - paraméterrel
    public List<Activity> selectActivitiesByType(ActivityType type){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM activities WHERE activity_type = ?"))
        {
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
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM activities WHERE id = ?"))
        {
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


    public List<Activity> selectActivityBeforeDate(LocalDate date){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM activities WHERE start_time < ?"))
        {

            //LocalDate konvertálása LocalDateTime-ra, mert az adatbázisban TimeStamp-ként van eltárolva és nem Date-ként, ezért kell neki az óra, perc is!
            LocalDateTime convertedDate = date.atTime(0,0);

            pst.setTimestamp(1, Timestamp.valueOf(convertedDate));
            return selectByPreparedStatement(pst);

        }catch (SQLException se){
            throw new IllegalStateException("Cannot select", se);
        }
    }



    //SELECT-ek végrehajtása!
    private List<Activity> selectByPreparedStatement(PreparedStatement pst) {

        List<Activity> activities = new ArrayList<>();
        try (ResultSet rs = pst.executeQuery())
        {
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
