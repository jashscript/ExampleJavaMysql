package ExampleJavaMysql;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Db {
    public static void ExecuteSql(Connection connection) {
        Statement smtp = null;
        ResultSet rs = null;
        try {
            smtp = connection.createStatement();
            smtp.executeUpdate("use TESTE");
            smtp.executeUpdate(
                    "INSERT INTO Testando (blabla)"
                            +"values (1)");
            rs = smtp.getResultSet();
            System.out.println(rs);
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { // it's not numeric; that's fine, just continue }
                rs = null;
            }

            if (smtp != null) {
                try {
                    smtp.close();
                } catch (SQLException sqlEx) { // it's not numeric; that's fine, just continue }
                smtp = null;
            }
        }
    }
}
