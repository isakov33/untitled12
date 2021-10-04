package com.company;

import java.util.Random;

public class Ded {
    private  String name;
    private  int age;
    private String face;
    private Hobie hobie;



    public Ded(String name, int age, String face, Hobie hobie) {
        this.name = name;
        this.age = age;
        this.face = face;
        this.hobie = hobie;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFace() {
        return face;
    }

    public Hobie getHobie() {
        return hobie;


    }
    public String getInfo() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", face='" + face + '\'' +
                ", hobie=" + hobie +
                '}';
    }
}
