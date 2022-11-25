package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Jeevan@6993");

        Statement statement=connection.createStatement();

        String insert= "insert into empInfo(id,name,address) values(2,'Jeevan','Satara')";

        int count= statement.executeUpdate(insert);

        System.out.println(count+" Row inserted");

    }
}
