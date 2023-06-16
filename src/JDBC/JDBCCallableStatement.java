package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCallableStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com:mysql:cj:jdbc:Driver");

        String url = "jdbc:mysql://localhost:3306/cyber_sucess";
        String userName = "root";
        String password = "Root@123456";

        Connection con = DriverManager.getConnection(url,userName,password);

        String Query = "call record_proc()";
        CallableStatement callableStatement = con.prepareCall(Query);

        boolean execute = callableStatement.execute();
        System.out.println("Data Inserted Successfully"+execute);
        con.close();
    }
}
