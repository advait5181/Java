package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com:mysql:cj:jdbc:Driver");

        String url="jdbc:mysql://localhost:3306/cyber_sucess";
        String userName="root";
        String password="Root@123456";

        Connection con = DriverManager.getConnection(url,userName,password);

        Statement st = con.createStatement();
        String CreateTable = "create table record(id int, name varchar(255),phone int)";
        boolean TableIsCreated = st.execute(CreateTable);
        System.out.println("Table Created Successfully"+TableIsCreated);
        con.close();
    }
}
