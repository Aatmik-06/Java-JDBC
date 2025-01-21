/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ram.bean;

/**
 *
 * @author adi18
 */
public class StudentBean {
    private int sid;
    private String name; 
    private String enroll;
    private int m ;
    private int p ;
    private int c ;
    private int h ;
    private int e ;
    private float per ;
    private int total ;
//    Member data
    
//    Constructor
//  non parameterised constructor 
    public StudentBean() {
    }
//  parameterised constructor 
    public StudentBean(int sid, String name, String enroll, int m, int p, int c, int h, int e, float per, int total) {
        this.sid = sid;
        this.name = name;
        this.enroll = enroll;
        this.m = m;
        this.p = p;
        this.c = c;
        this.h = h;
        this.e = e;
        this.per = per;
        this.total = total;
    }
   
//    Getter/Setter

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnroll() {
        return enroll;
    }

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
