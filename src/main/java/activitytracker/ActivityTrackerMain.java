package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {

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


        Activity activity = new Activity(LocalDateTime.of(2019, 03,14, 21,44), "Biking by Lake Velencei", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2020, 03,14, 21,44), "Hiking in Bakony", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 03,14, 21,44), "Running in Gerecse", ActivityType.RUNNING);


        Flyway flyway = Flyway.configure()
                .locations("/db/migration/activitytracker")
                .dataSource(dataSource)
                .load();
        flyway.clean();
        flyway.migrate();


        ActivityDao activityDao = new ActivityDao(dataSource);

        activityDao.insertActivity(activity);
        activityDao.insertActivity(activity2);
        activityDao.insertActivity(activity3);

        System.out.println(activityDao.selectById(3));
        System.out.println(activityDao.selectAllActivities());

    }
}
