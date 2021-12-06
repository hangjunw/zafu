package com.example.myapplication.beans;

import com.orm.SugarRecord;

public class User extends SugarRecord {
    String name;
    String pwd;

    public User(){
    }

    public User(String name, String pwd){
        this.name = name;
        this.pwd = pwd;
    }

    public String getName(){
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPwd(){
        return pwd;
    }

    public User setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

}
