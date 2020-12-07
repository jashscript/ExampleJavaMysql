package ExampleJavaMysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
        + "?user=root&password=root")) {
            Db.ExecuteSql(conn);
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
