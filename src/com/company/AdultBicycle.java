package com.company;


import java.util.Scanner;

public class AdultBicycle {
    private int turn;
    private int count;

    //Scanner sc = new Scanner (System.in);//
    //int a = sc.nextLine();//

    public AdultBicycle(int turn, int count) {
        this.turn = turn;
        this.count = count;
    }

    public int burnedCalories (Person p) {
        int getcalories = turn*count*p.getWeight();
        return getcalories;
    }
}
