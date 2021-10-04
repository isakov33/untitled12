package com.company;

public class Main {

    public static void main(String[] args) {
	Papa objectA = new Papa("mark,",45,"Smugle",Hobie.BASKETBALL);
    Son objectB = new Son("rashford",18,"BLACK",Hobie.BASKETBALL);
    Son objectC = new Son("coul",16,"white",Hobie.TENNIS);

        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());

    }
}
