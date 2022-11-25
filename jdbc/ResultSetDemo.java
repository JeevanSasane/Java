package jdbc;

import jdbc.com.jdbc.packages.ConnectionProvider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection connection= ConnectionProvider.getConnection();

        String query="Select * from empInfo";

        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(query);

        while (resultSet.next())
        {
            int id=resultSet.getInt(1);
            String name=resultSet.getString(2);
            String address=resultSet.getString(3);
            System.out.println(id+" "+name+" "+address);
        }

    }
}
