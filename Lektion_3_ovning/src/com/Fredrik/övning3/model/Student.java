// öv 1
package com.Fredrik.övning3.model;

public class Student{

    //öv 2
    public String name;
    public int age;

    //öv 3
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //öv 7
    public int doubleMyAge(){
        return age*2;
    }

    //öv 8
    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}
