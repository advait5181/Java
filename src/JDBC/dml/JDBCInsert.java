package JDBC.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306:/cyber_sucess";
        String username = "root";
        String password = "Root@123456";

        Connection connection = DriverManager.getConnection(url,username,password);

        Statement statement = connection.createStatement();

        String insertQuery = "insert into student"+"(name,email,phone,address)"+
                "value('Advait','advait@123','123456786','pune')";

        int executeUpdate = statement.executeUpdate(insertQuery);
        System.out.println("Data insert Successfully"+executeUpdate);

        connection.close();
    }
}
