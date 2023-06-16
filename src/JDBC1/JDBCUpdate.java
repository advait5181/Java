package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Class.forName("com:mysql:cj:jdbc:Driver");

        String url = "jdbc:mysql://localhost:3306/cyber_sucess";
        String userName="root";
        String password="Root@123456";

        Connection con = DriverManager.getConnection(url,userName,password);

        Statement st = con.createStatement();
        String executeQuery = "update record set phone=7030431147 where id=1";
        int executeUpdate = st.executeUpdate(executeQuery);
        System.out.println("Data updated Successfully"+executeUpdate);
        con.close();
    }
}
