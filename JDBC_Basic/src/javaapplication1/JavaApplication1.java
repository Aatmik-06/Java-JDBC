/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.sql.*;
/**
 *
 * @author adi18
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
//        Regrister the driver 
        Class.forName("com.mysql.cj.jdbc.Driver");
        
//        Create the connection
//        Connection conn = DriverManager.getConnection("mysql url ,userid ,password);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan10","root","2005");
        System.out.println("Connection Successfull!!!");
        
//        write sql query
        int sid = 105;
        String name ="happy";
        String enroll = "5ffdsf7";
        int p=47;
        int c=45;
        int m=54;
        int h=52;
        int e=63;
        int total =p+c+m+h+e;
        float per =total/5.0f;
        String sql ="insert into students values('"+sid+"','"+name+"','"+enroll+"','"+p+"','"+c+"','"+m+"','"+h+"','"+e+"','"+total+"','"+per+"')";
        
//        create object of statement 
        Statement stmt = conn.createStatement();
        
//        call executeQuery or executeUpdate();
        int r = stmt.executeUpdate(sql);
        
//        close the connection
        conn.close();
        if(r>0){
            System.out.println("Record Inserted Successfully!!!");
        }else{
            System.out.println("Record Not Inserted");
        }
    }
}
