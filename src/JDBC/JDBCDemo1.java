package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "Root@123456";

        Connection con = DriverManager.getConnection(url,username,password);

        // Execute the queries:

        Statement statement = con.createStatement();
        String CreateTable="create table employee(id int, name varchar(255),price int)";
        boolean  isTableCreated = statement.execute(CreateTable);
        System.out.println("Table Created successfully "+isTableCreated);
        //5. close the connection
           con.close();
    }
}
