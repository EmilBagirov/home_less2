package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Person [] persons = new Person [3];
        AdultBicycle [] bike = new AdultBicycle[4];

        Scanner in = new Scanner(System.in);
        for (int i=0; i<persons.length; i++) {
            for (int j=0; j<bike.length;j++) {
                System.out.println("Введите данные пользователя # "+i+"и велосипеда # "+j);
                persons [i]=in.nextLine();
                bike [j]=in.nextLine();
            }
        }

        int a=in.nextLine();


        Person person1 = new Person(30,180,70,50,"Emil");
        Person person2 = new Person(35,190,80,40,"Vitya");
        Person person3 = new Person(40,200,90,60,"Afanasiy");

        MountainBicycle mountain1=new MountainBicycle(400,10);
        MountainBicycle mountain2=new MountainBicycle(500,10);
        MountainBicycle mountain3=new MountainBicycle(600,10);

        RoadBicycle road1 = new RoadBicycle (700,10);
        RoadBicycle road2 = new RoadBicycle (800,10);
        RoadBicycle road3 = new RoadBicycle (300,10);

        GnomeBicycle gnome1 = new GnomeBicycle();
        GnomeBicycle gnome2 = new GnomeBicycle();
        GnomeBicycle gnome3 = new GnomeBicycle();
        GnomeBicycle gnome4 = new GnomeBicycle();

        int calories1 = mountain1.burnedCalories(person1);
        int calories2 = mountain2.burnedCalories(person2);
        int calories3 = mountain3.burnedCalories(person3);

        int calories4 = road1.burnedCalories(person1);
        int calories5 = road2.burnedCalories(person2);
        int calories6 = road3.burnedCalories(person3);


        /*String reader_string=read.nextLine();

        //vvod strok
        Person [] persons = new Person [3];
        for (int i=0; i<persons.length;i++) {
            persons[i] = reader.readLine();
        }

        //vuvod strok
        for (int i=0; i<persons.length; i++) {
            int j = persons.length-i-1;
            System.out.println(persons[j]);
        }*/


        System.out.println("Person1 on mountain1 burns " + calories1+" calories");
        System.out.println("Person2 on mountain2 burns " + calories2+" calories");
        System.out.println("Person3 on mountain3 burns " + calories3+" calories");
        System.out.println("Person1 on road1 burns " + calories4+" calories");
        System.out.println("Person2 on road2 burns " + calories5+" calories");
        System.out.println("Person3 on road3 burns " + calories6+" calories");

    }
}
