package com.Fredrik.övning3.model;

public class Student{

    public String name;
    public int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int doubleMyName(){
        return age*2;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}
