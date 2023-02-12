package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private final int age;

    private final String gender;

    public Person(String nombre, int age, String gender) {
        this.name = nombre;
        this.age = age;
        this.gender = gender;
    }

    public String name(){
        return name;
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
        double[] res = new double[]{0.0, 0.0};
        if (!persons.isEmpty()){
            for(int i=0; i<persons.size(); i++){
                if(persons.get(i).gender.equalsIgnoreCase("Male")) {
                    masc.add(persons.get(i).age());
                } else {
                    fem.add(persons.get(i).age());
                }
            }
            if(!masc.isEmpty()) {
                for(int i=0; i<masc.size();i++){
                    avgMale+= masc.get(i);
                }
                res[0] = avgMale/masc.size();
            }
            if (!fem.isEmpty()) {
                for(int i=0; i<fem.size();i++){
                    avgFem+= fem.get(i);
                }
                res[1] = avgFem/fem.size();
            }
        }
        return res;
    }
}

