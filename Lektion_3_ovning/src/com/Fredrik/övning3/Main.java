package com.Fredrik.övning3;


import com.Fredrik.övning3.model.Student;

public class Main {

    public static void main(String[] args) {

    Student kalle = new Student("KAlle", 20);

        System.out.println(kalle.name);
        System.out.println(kalle.age);


/*
        for(int i = 10; i < 15; i++){
            Student bella = new Student("Bella", i);
            System.out.println(bella.name);
            System.out.println(bella.age);
            System.out.println("");
        }

 */

        System.out.println(kalle.doubleMyName());

        Student benny = new Student("Benny", 30);
        System.out.println(benny);





    }







}
