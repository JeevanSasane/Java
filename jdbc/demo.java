package jdbc;

import java.sql.*;
// Program for jdbc connection
public class demo {
    public static void main(String[] args) {
        try {
            // Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating a connection
            String url="jdbc:mysql://localhost:3306/employee";
            String user="root";
            String password="Jeevan@6993";

            Connection connection=DriverManager.getConnection(url,user,password);
//            if(connection.isClosed()){
//                System.out.println("Connection is close");
//            }else {
//                System.out.println("Connection created");
//            }

            //Create Query

            String query="create table emp1(id int(20) primary key auto_increment, name varchar(100), address varchar(100))";

            //create a statement

            Statement statement=connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table created");
            connection.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
