package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String nombre;
    private final int age;

    private final String gender;

    public Person(String nombre, int age, String gender) {
        this.nombre = nombre;
        this.age = age;
        this.gender = gender;
    }

    public String name(){
        return nombre;
    }

    public int age(){
        return age;
    }

    public String gender() {
        return gender;
    }

    public double[] avergareAgePerGender(List<Person> persons) {
        List<Integer> masc = new ArrayList<>();
        List<Integer> fem = new ArrayList<>();
        int avgMale=0;
        int avgFem=0;
        double[] res = new double[2];
        for(int i=0; i<persons.size(); i++){
            if(persons.get(i).gender.equalsIgnoreCase("Male")) {
                masc.add(persons.get(i).age());
            } else {
                fem.add(persons.get(i).age());
            }
        }
        for(int i=0; i<masc.size();i++){
            avgMale+= masc.get(i);
        }
        for(int i=0; i<fem.size();i++){
            avgFem+= fem.get(i);
        }
        res[0] = avgMale/masc.size();
        res[1] = avgFem/fem.size();
        return res;
    }
}


