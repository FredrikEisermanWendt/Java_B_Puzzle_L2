package com.Fredrik.övning3;


import com.Fredrik.övning3.model.Student;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static Student[] studArray = new Student[5];



    public static void main(String[] args) {

        //öv 4

        Student kalle = new Student("KAlle", 20);

        // öv 5 Kan inte komma åt instansvariablerna om jag ändrar visability modifyer.
        System.out.println(kalle.name);
        System.out.println(kalle.age);


        // öv 6 enligt KISS
        for (int i = 7; i < 12; i++){
            Student bella = new Student("Bella", i);
            System.out.println(bella.name);
            System.out.println(bella.age);
            System.out.println("");

        }

        //öv 6 annan lösning med random ålder
        for(int i = 10; i < 15; i++){
            Random r = new Random();
            int randAge = r.nextInt(7, 40 + 1);
            Student bella = new Student("Bella", randAge);
            System.out.println(bella.name);
            System.out.println(bella.age);
            System.out.println("");
        }

        //öv 6 lösning 3 som ger olika namn och lägger Studenter i en array
        studentGenerator();


        // öv 7
        System.out.println(kalle.doubleMyAge());

        //öv 8
        Student benny = new Student("Benny", 30);
        System.out.println(benny);
        System.out.println("");






    }

    public static void studentGenerator(){
        String[] names = {"Hanna", "Minna", "Kalle", "Jonas", "Bella"};
        Random r = new Random();
        for (int i = 0; i < 5; i++){
        int age = r.nextInt(7, 66);
            studArray[i] = new Student(names[i], age);
        }

        System.out.println(Arrays.toString(studArray));
    }







}
