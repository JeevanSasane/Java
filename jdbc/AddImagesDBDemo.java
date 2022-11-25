package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddImagesDBDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Jeevan@6993");

        String query="insert into images (pic) values(?)";

        PreparedStatement preparedStatement= connection.prepareStatement(query);
        FileInputStream fileInputStream=new FileInputStream("D:\\E drive\\images\\6.jpg");
//        preparedStatement.setBlob(1,fileInputStream,fileInputStream.available());
        preparedStatement.setBinaryStream(1,fileInputStream,fileInputStream.available());

        preparedStatement.executeUpdate();
        System.out.println("Done");
    }
}
