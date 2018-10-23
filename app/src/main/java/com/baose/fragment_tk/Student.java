package com.baose.fragment_tk;

import java.io.Serializable;

public class Student implements Serializable{

    private String hoten;
    private int namsinh;
    private String diachi, email;

    public Student(String hoten, int namsinh, String diachi, String email) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.email = email;
    }

    public Student() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hoten='" + hoten + '\'' +
                ", namsinh=" + namsinh +
                ", diachi='" + diachi + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
