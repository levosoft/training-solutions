package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    public void init(){

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

        Flyway flyway = Flyway.configure()
                .locations("/db/migration/activitytracker")
                .dataSource(dataSource)
                .load();
        flyway.clean();
        flyway.migrate();

        Activity activity = new Activity(LocalDateTime.of(2019, 03,14, 21,44), "Biking by Lake Velencei", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2020, 03,14, 21,44), "Hiking in Bakony", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 03,14, 21,44), "Running in Gerecse", ActivityType.RUNNING);

        activityDao = new ActivityDao(dataSource);

        activityDao.insertActivity(activity);
        activityDao.insertActivity(activity2);
        activityDao.insertActivity(activity3);

    }


    @Test
    public void insertElementTest(){
        Activity activity = new Activity(LocalDateTime.of(2021, 03,14, 21,44), "Biking by Lake Velencei", ActivityType.BIKING);
        activityDao.insertActivity(activity);

        assertEquals(activityDao.selectAllActivities().size(), 4);
    }

    @Test
    public void selectByTypeTest(){
        assertEquals(activityDao.selectActivitiesByType(ActivityType.BIKING).size(), 1);
    }


}
