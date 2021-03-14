package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {


    public void insertActivity(DataSource dataSource, Activity activity){
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


    public Activity selectById(DataSource dataSource, long id){
        try (Connection conn = dataSource.getConnection();
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM activities WHERE id = ?")) {
             pst.setLong(1, id);

             return selectByPreparedStatement(pst);

        }catch (SQLException se){
            throw new IllegalStateException("Cannot select", se);
        }
    }

    private Activity selectByPreparedStatement(PreparedStatement pst) {
        try (
                ResultSet rs = pst.executeQuery()
        ) {
            if(rs.next()) {
                Activity activity = new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));
                return activity;
            }
            throw new IllegalArgumentException("Not found");
        }catch (SQLException sqle){
            throw new IllegalStateException("Cannot query", sqle);
        }
    }


    public static void main(String[] args) {

        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        Activity activity = new Activity(LocalDateTime.of(2021, 03,14, 21,44), "Biking by Lake Velencei", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 03,14, 21,44), "Hiking in Bakony", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 03,14, 21,44), "Running in Gerecse", ActivityType.RUNNING);

        ActivityTrackerMain atm = new ActivityTrackerMain();
//        atm.insertActivity(dataSource, activity);
//        atm.insertActivity(dataSource, activity2);
//        atm.insertActivity(dataSource, activity3);

        System.out.println(atm.selectById(dataSource, 3));


    }
}
