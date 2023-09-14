package com.FREDRIKEISERMANWENDT.demo;

import java.util.Arrays;

public class Uppgifter {
    public static void main(String[] args) {

        //part 1
        int x = 10;
        int y = 12;

        System.out.println(x+y);

        //part 2
        String[] names = {"Kalle", "Bella", "Jonte"};

        System.out.println(names[0]);

        //part 3
        String name1 = "Kalle";
        String name2 = "Bella";

        String concatName = name1 + name2;

        System.out.println(concatName);
        System.out.println(name1 + name2);


        //part 4
        /*
        * Programet kör inte alls utan public main metod
        * */


        //part 5
        /*får felmeddelande att mainmetoden inte är korrekt
        * */


        //part 6
        int number = 5;
        int Number = 10;
        System.out.println(number + Number);
        //de läggs ihop till summan av de båda.

        //part 7
        //Jag får ett Kompileringsfel då jag inte kan föra in en boolean i en int[] eller en int i en boolean[]

        //8
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(myArray));








    }
}
