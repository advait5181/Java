package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Class.forName("com:mysql:cj:jdbc:Driver");

        String url="jdbc:mysql://localhost:3306/cyber_sucess";
        String userName="root";
        String password="Root@123456";

        Connection con = DriverManager.getConnection(url,userName,password);

        Statement st = con.createStatement();
        String insertQuery="insert into record"+"(id,name,phone)"+ "value(2,'Anil',9860459745)";

        int executeUpdate = st.executeUpdate(insertQuery);
        System.out.println("Data inserted Successfully"+executeUpdate);
        con.close();
    }
}
