package com.java8.domain.objects;

public class Student {


    private String name;
    private Gender gender;

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
;

    public Student(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
}
