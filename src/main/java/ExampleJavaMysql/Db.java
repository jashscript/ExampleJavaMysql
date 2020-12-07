package ExampleJavaMysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Db {
    public static void ExecuteSql(Connection connection) {
        ResultSet rs = null;
        try(Statement smtp = connection.createStatement()) {
            smtp.executeUpdate("use TESTE");
            smtp.executeUpdate("INSERT INTO Testando (blabla)" + "values (1)");
            rs = smtp.getResultSet();
            System.out.println(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}