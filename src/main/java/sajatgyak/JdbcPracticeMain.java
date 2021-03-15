package sajatgyak;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;


//JDBC
//17.hét - 02.22. Mid-level, (31'30"-)
//                           (42'40"-)


public class JdbcPracticeMain {

    public static void main(String[] args) {

        //DataSource létrehozása
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }


        //Flyway futtatása (43'30")
        //Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        Flyway flyway = Flyway.configure()
                .locations("/db/migration/sajatgyak")
                .dataSource(dataSource)
                .load();
        flyway.clean();
        flyway.migrate();
        flyway.clean();
        flyway.migrate();


        //SQL utasítások futtatása DAO-objektumból
        JdbcPracticeDao dao = new JdbcPracticeDao(dataSource);
        dao.createEmployee("John Rambo");


    }




}
