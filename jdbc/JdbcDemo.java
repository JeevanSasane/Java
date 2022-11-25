package jdbc;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Jeevan@6993");

            Statement statement=connection.createStatement();
            String select="select * from empInfo";
            ResultSet resultSet=statement.executeQuery(select);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
