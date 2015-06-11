package com.company;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File dir = new File("D:/Dropbox");
        File inputFile = new File(dir, "input1.txt");
        FileInputStream fis = new FileInputStream((inputFile));

        AdultBicycle[] bike = new AdultBicycle[7];
        ArrayList <Person> persons = new ArrayList<Person>();

        Scanner sc1 = new Scanner(System.in);
        Scanner sc = new Scanner(fis);

        enterPersons(persons,sc1);
        parseBikes(bike,sc);

        for (Person p:persons) {
            for (AdultBicycle b:bike) {
                if (b instanceof MountainBicycle) {
                    System.out.println("Person "+p.getName()+ " burns "+b.burnedCalories()+" calories on"+((MountainBicycle) b).getType()+" bicycle");
                }else if (b instanceof RoadBicycle) {
                    System.out.println("Person "+p.getName()+ " burns "+b.burnedCalories()+" calories on"+((RoadBicycle) b).getType()+" bicycle");
                }
            }
        }

    }

        private static void enterPersons (ArrayList<Person> persons, Scanner sc1) {
            String name="";
                for (int i=0; i<5; i++) {
                    if (!(name.equals("done"))) {
                        Person pers = new Person();
                        System.out.println("Enter person " + (i+1) + " name: ");
                        pers.setName(sc1.nextLine());
                        System.out.println("Enter person " + (i+1) + " age: ");
                        pers.setAge(sc1.nextInt());
                        System.out.println("Enter person " + (i+1) + " weight: ");
                        pers.setWeight(sc1.nextInt());
                        System.out.println("Enter person " + (i+1) + " height: ");
                        pers.setHeight(sc1.nextInt());
                        System.out.println("Enter person " + (i+1) + " girth: ");
                        pers.setGirth(sc1.nextInt());
                        persons.add(pers);
                        //System.out.print("You entered: " + pers.getAge()+"|"+pers.getWeight()+"|"+pers.getHeight()+"|"+pers.getGirth()+"|"+pers.getName());
                    }
                    else
                        System.out.println("The end");
                }
        }


    private static void parseBikes(AdultBicycle[] bike, Scanner sc) throws FileNotFoundException {
        int i = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line != null && !line.equals("")) {
                JSONObject jsonObject = (JSONObject) JSONValue.parse(line);
                if (jsonObject != null) {
                    String name = (String) jsonObject.get("name");
                    if ("mountain".equals(name)) {
                        Long age = (Long) jsonObject.get("age");
                        Long height = (Long) jsonObject.get("height");
                        Long weight = (Long) jsonObject.get("weight");
                        Long girth = (Long) jsonObject.get("girth");
                        MountainBicycle m = new MountainBicycle();
                        m.setAge(age.intValue());
                        m.setGirth(girth.intValue());
                        m.setHeight(height.intValue());
                        m.setWeight(weight.intValue());
                        bike[i] = m;
                    } else if ("road".equals(name)) {
                        Long age = (Long) jsonObject.get("age");
                        Long height = (Long) jsonObject.get("height");
                        Long weight = (Long) jsonObject.get("weight");
                        Long girth = (Long) jsonObject.get("girth");
                        RoadBicycle r = new RoadBicycle();
                        r.setAge(age.intValue());
                        r.setGirth(girth.intValue());
                        r.setHeight(height.intValue());
                        r.setWeight(weight.intValue());
                        bike[i] = r;
                    }
                    i++;
                }
            }
        }
    }
}

