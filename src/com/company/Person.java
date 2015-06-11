package com.company;

import java.util.Scanner;

/**
 * Created by bagirov on 21.05.2015.
 */
public class Person {

    private int age;
    private int height;
    private int weight;
    private int girth;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGirth() {
        return girth;
    }
    public void setGirth(int girth) {
        this.girth = girth;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public Person () {

    }

    public void personPrint () {
        System.out.println("My name is " + name);
        System.out.println("I'm  " + age);
        System.out.println("My weight is " + weight);
        System.out.println("My height is " + height);
        System.out.println("My girth is " + girth);



    }
}
