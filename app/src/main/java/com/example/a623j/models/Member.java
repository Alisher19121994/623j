package com.example.a623j.models;

public class Member {


    String fullname;
    int age;

    public Member() {
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAge(String age) {
        this.age = Integer.parseInt(age);
    }

    public Member(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }
}
