package jdbc.com.jdbc.packages;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        Connection connection=ConnectionProvider.getConnection();

        String query="insert into images(pic) values (?)";
        PreparedStatement preparedStatement= connection.prepareStatement(query);

        JFileChooser jFileChooser=new JFileChooser();
        jFileChooser.showOpenDialog(null);
        File file=jFileChooser.getSelectedFile();


        FileInputStream fileInputStream=new FileInputStream(file);
        preparedStatement.setBinaryStream(1,fileInputStream,fileInputStream.available());
        preparedStatement.executeUpdate();

//        System.out.println("Done......");
        JOptionPane.showMessageDialog(null,"Success");
    }

}
