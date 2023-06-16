package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Class.forName("com:mysql:cj:jdbc:Driver");

        String url="jdbc:mysql://localhost:3306/King";
        String userName="root";
        String password="Root@123456";

        Connection con = DriverManager.getConnection(url,userName,password);

        Statement st = con.createStatement();
        String CreateTable = "create table record(id int,product varchar(255),price int,color varchar(255))";
        boolean TableIsCreated = st.execute(CreateTable);
        System.out.println("Table Created Successfully"+TableIsCreated);
        con.close();
    }
}
