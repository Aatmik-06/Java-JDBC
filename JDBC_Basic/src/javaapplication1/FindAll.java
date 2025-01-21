/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.sql.*;

/**
 *
 * @author adi18
 */
public class FindAll {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
//        Create the Connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan10","root","2005");
        System.out.println("Connection Successfull!!!");
//        Write sql query
        String sql ="select * from students";
//        Create object of statement
        Statement stmt= conn.createStatement();
//        call execut query method and extract row by row data from resut set 
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println("\t"+rs.getInt("sid")+"\t"+rs.getString("name")+"\t"+rs.getString("enroll")+"\t"+rs.getInt("m")+"\t"+rs.getInt("p")+"\t"+rs.getInt("c")+"\t"+rs.getInt("h")+"\t"+rs.getInt("e")+"\t"+rs.getFloat("per")+"\t"+rs.getInt("total"));
        }
        
    }
    
}
