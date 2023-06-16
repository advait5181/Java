package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com:mysql:cj:jdbc:Driver");

        String url = "jdbc:mysql://localhost:3306/cyber_sucess";
        String userName = "root";
        String password = "Root@123456";

        Connection con = DriverManager.getConnection(url,userName,password);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id,name,phone");
        int id = scanner.nextInt();
        String name = scanner.next();
        int phone = scanner.nextInt();

        String insertQuery = "insert into record(id,name,phone) value(?,?,?)";
        PreparedStatement statement = con.prepareStatement(insertQuery);
        statement.setInt(2,id);
        statement.setString(3,name);
        statement.setInt(3,phone);

         int executeQuery = statement.executeUpdate();
        System.out.println("Data inserted successfully"+executeQuery);
        con.close();
    }
}
