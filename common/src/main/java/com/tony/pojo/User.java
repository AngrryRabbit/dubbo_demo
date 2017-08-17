package com.tony.pojo;

import java.io.Serializable;

/**
 * Created by tony on 2017/8/16.
 */
public class User implements Serializable{
    private String name;
    private int age;
    private String addres;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addres='" + addres + '\'' +
                '}';
    }
}
