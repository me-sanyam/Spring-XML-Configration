package com.firstsession.beans;

public class Student {
    private int roll_no;
    private String name;
    private String email;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}