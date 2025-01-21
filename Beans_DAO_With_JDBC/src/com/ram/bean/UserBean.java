/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ram.bean;

/**
 *
 * @author adi18
 */
public class UserBean {
    
    private int uid ;
    private String name;
    private String username;
    private String password;
    private String email;
    private String Mobile;

//    making default constructor 
    public UserBean() {
    }
//    making parametered constructor 
    public UserBean(int uid, String name, String username, String password, String email, String Mobile) {
        this.uid = uid;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.Mobile = Mobile;
    }

//    making getter and setter     
    public int getUid() {
        return uid;
    }

    public void setUid(int sid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }
    
    
    
    
    
}
