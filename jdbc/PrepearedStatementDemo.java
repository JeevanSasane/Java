package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepearedStatementDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:3306/[java25aug]","root","password");

        Scanner scanner=new Scanner(System.in);
        int id;
        String name;
        String  address;

        System.out.println("Enter values:");
        id=scanner.nextInt();
        name=scanner.next();
        address=scanner.next();

//        String insert="insert into employee(id,name,address)values(?,?,?)";
        String update="update employee set name=? where id=?";
//        PreparedStatement preparedStatement=connection.prepareStatement(insert);
        PreparedStatement preparedStatement=connection.prepareStatement(update);

        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,address);

        int count=preparedStatement.executeUpdate();
        System.out.println(count+" row updated");


    }
}

//delimeter
