package com.company;

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

    public Person ( int age, int height, int weight, int girth, String name) {

        this.age=age;
        this.height=height;
        this.weight=weight;
        this.girth=girth;
        this.name=name;

    }

}
