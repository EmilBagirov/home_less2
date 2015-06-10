package com.company;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File dir = new File("C:/Users/bagirov/Desktop/emil/PROJECTS/java_projects");
        File inputFile = new File(dir, "input1.txt");
        FileInputStream fis = new FileInputStream((inputFile));
        Scanner sc = new Scanner(fis);

        AdultBicycle[] bike = new AdultBicycle[7];
        ArrayList <Person> persons = new ArrayList<Person>();
        enterPersons(persons, sc);

    }

        private static void enterPersons (ArrayList<Person> persons, Scanner sc) {
            int age, weight, height, girth;
            String name=null;
                for (Person person: persons) {
                    System.out.print("Enter person's # " + person + " data: ");
                    if (sc.hasNextInt() && !(name.equals("done"))) {
                        age = sc.nextInt();
                        weight = sc.nextInt();
                        height = sc.nextInt();
                        girth = sc.nextInt();
                        name = sc.nextLine();
                        Person pers = new Person(age, weight, height, girth, name);
                        pers.setAge(age);
                        pers.setWeight(weight);
                        pers.setHeight(height);
                        pers.setGirth(girth);
                        pers.setName(name);
                        System.out.print("You entered: " + pers.getAge());
                    }

                }
        }


    private static void parseBikes(AdultBicycle[] bike, Scanner sc) {
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

