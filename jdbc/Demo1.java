package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/employee";
        String user="root";
        String password="Jeevan@6993";

        Connection connection= DriverManager.getConnection(url,user,password);

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter values:");
        String name=scanner.next();
        String address=scanner.next();

        String query="insert into emp1(name,address) values(?,?)";

        //get PreparedStatement Object
        PreparedStatement preparedStatement=connection.prepareStatement(query);

        //set the values to the query
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,address);

        preparedStatement.executeUpdate();
        System.out.println("Done");
        connection.close();
    }
}
