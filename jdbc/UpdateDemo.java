package jdbc;

import jdbc.com.jdbc.packages.ConnectionProvider;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class UpdateDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection connection= ConnectionProvider.getConnection();

        String query="update emp1 set name=?, address=? where id=?";
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter name:");
        String name=scanner.next();
        System.out.println("Enter Address:");
        String address=scanner.next();

        System.out.println("Enter id:");
        int id=scanner.nextInt();

        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,address);
        preparedStatement.setInt(3,id);

        preparedStatement.executeUpdate();
        System.out.println("Record Updated successfully..");
//        JOptionPane.showMessageDialog(null,"Update Successfully...");

    connection.close();
    }
}


//dml=>
//    insert/update/delete

//ddl=>
//   create/alter/drop
//dql=>
//    select