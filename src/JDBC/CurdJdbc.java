package JDBC;

import java.sql.*;
import java.util.Scanner;

public class CurdJdbc {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        String url="jdbc:mysql://localhost:3306/King";
        String userName = "root";
        String password = "Root@123456";

        Connection conn = DriverManager.getConnection(url,userName,password);
        int ch;
        do{
            System.out.println("1.insert Record");
            System.out.println("2.Display all record");
            System.out.println("3.Search Record");
            System.out.println("4.Delete Record");
            System.out.println("5.Update Record");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter product name");
                    String product = sc.next();
                    System.out.println("Enter product price");
                    int price = sc.nextInt();
                    System.out.println("Enter product color");
                    String color = sc.next();
                    String Query = "insert into record(id,product,price,color) values(?,?,?,?)";
                    PreparedStatement preparedStatement = conn.prepareStatement(Query);
                    preparedStatement.setString(1, product);
                    preparedStatement.setInt(2, price);
                    preparedStatement.setString(3, color);
                    int executeUpdate = preparedStatement.executeUpdate();
                    System.out.println("Data inserted successfully" + executeUpdate);
                break;

                case 2 :
                    System.out.println("These are all record");
                    Statement statement1 = conn.createStatement();
                    ResultSet resultSet = statement1.executeQuery("select * from product");
                    while (resultSet.next()) {
                        System.out.println("==================================");
                        System.out.println(resultSet.getInt("id")
                                + "\t" + resultSet.getString("product") + "\t" + resultSet.getInt("price")
                                + "\t" + resultSet.getString("color"));
                    }
                    System.out.println("======================");

                case 3:
                    System.out.print("Enter Id to Search Record : ");
                    int id2 = sc.nextInt();
                    PreparedStatement statement = conn.prepareStatement("select * from product where id=?");
                    statement.setInt(1, id2);
                    ResultSet resultSet1 = statement.executeQuery();
                    while (resultSet1.next()) {
                        System.out.println("======================");
                        System.out.println(resultSet1.getInt("id")
                                + "-" + resultSet1.getString("name")
                                + "-" + resultSet1.getInt("price")
                                + "-" + resultSet1.getString("colour"));
                        System.out.println("======================");
                    }
                break;

                case 4 :
                    System.out.println("Enter Id Delete Record");
                    int id = sc.nextInt();
                    Statement statement2 = conn.createStatement();
                    statement2.execute("delete from product where id='" + id + "'");
                    System.out.println("Record Deleted Successfully");
                break;

                case 5:
                    System.out.print("Enter Product id to Update Price : ");
                    int id1 = sc.nextInt();
                    System.out.print("Enter New Price : ");
                    int price1 = sc.nextInt();
                    Statement statement3 = conn.createStatement();
                    statement3.executeUpdate("update product set price='" + price1 + "' where id='" + id1 + "'  ");
                    System.out.println("Record Updated Successfully");
                break;
            }

        }while(ch!=0);
        System.out.println("==========================");
        System.out.println("Thank You ....!!!");
        System.out.println("==========================");
        // Close connection
        conn.close();

    }
}
