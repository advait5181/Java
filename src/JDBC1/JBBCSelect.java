package JDBC1;

import java.sql.*;

public class JBBCSelect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Class.forName("com:mysql:cj:jdbc:Driver");

         String url = "jdbc:mysql://localhost:3306/cyber_sucess";
         String userName = "root";
         String password = "Root@123456";

         Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();
        ResultSet resultset = st.executeQuery("select * from record");

        while(resultset.next()){
            System.out.println(resultset.getInt("id") + "\t" +resultset.getString("name") +"\t"
                    + resultset.getString("phone"));
        }
        con.close();
    }
}
