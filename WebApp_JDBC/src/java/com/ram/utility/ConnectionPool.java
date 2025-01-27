/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ram.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author adi18
 */
public class ConnectionPool {
    static Connection conn;
    public static Connection connectDB() {
        try {
            //        Regrister the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan10","root","2005");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Connection Successfull!!!");
    
        return conn;    
    }
    public static void main(String[] args) {
        connectDB();  
    }
}
