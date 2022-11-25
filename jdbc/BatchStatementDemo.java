package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BatchStatementDemo {
    public static void main(String[] args) {

        String insert="insert into emp1(id,name,address) values(?,?,?)";

        Object ConnectionConfig;
//        PreparedStatement preparedStatement= ConnectionConfig.getConn()
//        PreparedStatement preparedStatement = ConnectionConfig.getConn().prepareStatement(insert);

    }
}
