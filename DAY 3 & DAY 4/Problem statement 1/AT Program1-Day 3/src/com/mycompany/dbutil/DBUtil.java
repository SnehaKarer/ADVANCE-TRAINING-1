package com.mycompany.dbutil;
/*  dbUtil - Database connection classes, useful for jdbc connection*/
import java.sql.*;

public class DBUtil {
	 private static Connection conn;
    //static method that creates a connection to the database and return the connection object
    public static Connection getConnection()
    {
      
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "Sneha@1999");
           
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
       return conn;
    }

    //close connection
    public static void closeConnection(Connection conn)
    {
        try{
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}