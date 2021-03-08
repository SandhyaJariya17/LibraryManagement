package Util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 1711j
 */
public class SqlUtil {
     public final static String USERNAME="root";
     public final static String PASSWORD="root";
     public final static String DBNAME="library";
     public final static String URL="jdbc:mysql://localhost:3306/"+DBNAME;
     
    public static Connection conn;
    public static Statement stmt;
 public final static void connectDB() throws ClassNotFoundException,SQLException {
     Class.forName("com.mysql.jdbc.Driver");
     conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
     stmt=conn.createStatement();
     
    }
 
 public final static int insert(String query) throws SQLException{
     int result=0;
     if(query!=""){
         result=stmt.executeUpdate(query);
         }
     return result;
     } 
 
public final static int update(String query) throws SQLException{
     int result=0;
     if(query!=""){
         result=stmt.executeUpdate(query);
         }
     return result;
     
 } 

public final static int delete(String query) throws SQLException{
     int result=0;
     if(query!=""){
         result=stmt.executeUpdate(query);
         }
     return result;
     
 } 

public final static ResultSet fetch(String query) throws SQLException{
     ResultSet rs=null;
     if(query!=""){
         rs=stmt.executeQuery(query);
         }
     return rs;
     
 } 

public static final void close() throws SQLException{
    if(stmt!=null){
        stmt.close();
    }
    if(conn!=null){
        conn.close();
    }
}
}
