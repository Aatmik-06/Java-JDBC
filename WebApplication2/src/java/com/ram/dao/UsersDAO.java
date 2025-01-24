/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ram.dao;
import java.sql.*;
import com.ram.bean.UserBean;
import com.ram.utility.ConnectionPool;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author adi18
 */
public class UsersDAO {
    static Connection conn;
    public int registerUser(UserBean ub){
        conn= ConnectionPool.connectDB();
         String sql="insert into users values('"+ub.getUid()+"','"+ub.getName()+"','"+ub.getUsername()+"','"+ub.getPassword()+"','"+ub.getEmail()+"','"+ub.getMobile()+"')";
        //step4:
        Statement stmt;
        int r=0;
        try {
            stmt = conn.createStatement();
            r=stmt.executeUpdate(sql);
              //step6:
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        return r;
    }
    
     public int loginCheck(String username,String password){
          conn= ConnectionPool.connectDB();
          int id = 0 ;
         String sql="select uid from users where username ='"+username+"' and password='"+password+"'";
        //step4:
        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql);
              //step6:
        conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        return id;
     }
    public static void main(String[] args) {
        
//        Updating data

//        UserBean u = new UserBean();
//        
//        u.setUid(101);
//        u.setName("Aadi");
//        u.setEmail("mcdkmikmd");
//        u.setMobile("87878787878");
//        u.setPassword("psw");
//        u.setUsername("Aadi");
//        UsersDAO ud = new UsersDAO();
//        
//        int r =ud.registerUser(u);
//         if(r>0){
//           System.out.println("Data update success");
//       }else{
//           System.out.println("Data not updated");
//       }




//     displaying data    
        UsersDAO ud = new UsersDAO();
        
        
        int result =ud.loginCheck("Aadi","psw");
         if(result>0){
           System.out.println("Login success");
             System.out.println(result);
           
       }else{
           System.out.println("Login Failed");
       }
         
        
        
        
    }
    
}
    
