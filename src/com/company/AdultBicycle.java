package com.company;


import java.util.Scanner;

public abstract class AdultBicycle {
    private int turn;
    private int count;

    //Scanner sc = new Scanner (System.in);//
    //int a = sc.nextLine();//


    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public AdultBicycle() {

    }

    protected int burnedCalories (Person p) {
        int getCalories = turn*count*p.getWeight();
        return getCalories;
    }

}
