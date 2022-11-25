package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsingBufferReader {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/employee";
        String user="root";
        String password="Jeevan@6993";

        Connection connection= DriverManager.getConnection(url,user,password);

        String query="insert into emp1(name,address) values(?,?)";

        PreparedStatement preparedStatement=connection.prepareStatement(query);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter values:");
        String name=bufferedReader.readLine();
        String adddress=bufferedReader.readLine();

        preparedStatement.setString(1,name);
        preparedStatement.setString(2,adddress);

        preparedStatement.executeUpdate();

        System.out.println("Inserted");

    }
}
