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
public class updatedata {

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
        int sid = 101;
        String name ="Aatmik";
        String enroll = "054klf";
        int p=75;
        int c=76;
        int m=33;
        int h=45;
        int e=75;
        int total =p+c+m+h+e;
        float per =total/5.0f;
        String sql = "update students set name='"+name+"',enroll='"+enroll+"',m='"+m+"',p='"+p+"',c='"+c+"',h='"+h+"',e='"+e+"',total='"+total+"',per='"+per+"' where sid='"+sid+"' ";
        
//        create object of statement 
        Statement stmt = conn.createStatement();
        
//        call executeQuery or executeUpdate();
        int r = stmt.executeUpdate(sql);
        
//        close the connection
        conn.close();
        if(r>0){
            System.out.println("Record Updated Successfully!!!");
        }else{
            System.out.println("Record Not Updated");
        }
    }
}
