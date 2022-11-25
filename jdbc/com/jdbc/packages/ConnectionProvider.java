package jdbc.com.jdbc.packages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        if (connection==null)
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Jeevan@6993");
        }
        return connection;
    }
}
