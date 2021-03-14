package sajatgyak;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//JDBC
//17.hét - 02.22. Mid-level, (40'55"-)

public class JdbcPracticeDao {

    private DataSource dataSource;

    public JdbcPracticeDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    //INSERT
    public void createEmployee(String name){
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps =
                        conn.prepareStatement("INSERT INTO employees(emp_name) VALUES (?)")){
            ps.setString(1,name);
            ps.executeUpdate();
        } catch (
                SQLException se){
            throw new IllegalStateException("Can not insert", se);
        }
    }


    //SELECT
    public List<String> listEmployeeNames(){
        try (
                Connection conn = dataSource.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT emp_name FROM employees")
        ){
            List<String> names = new ArrayList<>();
            while (rs.next()){
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;
        }
        catch (SQLException se){
            throw new IllegalStateException("Cannot select employees", se);
        }
    }


    public String findEmployeeNameById(long id){
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("SELECT emp_name FROM employees WHERE id = ?");
        ){
            ps.setLong(1, id);

            return selectNameByPreparedStatement(ps);
        }
        catch (SQLException se){
            throw new IllegalStateException("Cannot query", se);
        }
    }

    private String selectNameByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
                if(rs.next()) {
                    String name = rs.getString("emp_name");
                    return name;
            }
            throw new IllegalArgumentException("Not found");
        }catch (SQLException sqle){
            throw new IllegalStateException("Cannot query", sqle);
        }
    }




}
