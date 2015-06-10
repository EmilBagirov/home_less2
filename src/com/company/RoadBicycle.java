package com.company;

public class RoadBicycle extends AdultBicycle {
    int age, weight, height, girth;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getGirth() {
        return girth;
    }

    public void setGirth(int girth) {
        this.girth = girth;
    }



    @Override
    protected int burnedCalories(Person p) {
        return super.burnedCalories(p);
    }
}
