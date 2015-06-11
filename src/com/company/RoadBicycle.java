package com.company;

public class RoadBicycle implements AdultBicycle {
    private int age;
    private int height;
    private int weight;
    private int girth;
    private String name;
    private String type;
    private Long count;
    private Long speed;

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public RoadBicycle() {
    }

    @Override
    public Long burnedCalories() {
        return (count*weight)+speed;
    }
}
