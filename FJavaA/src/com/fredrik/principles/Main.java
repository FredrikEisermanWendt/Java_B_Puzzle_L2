package com.fredrik.principles;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    /*
    * metoder
    * #1 aldrig metoder i metoder
    * #2 bör ha en bestämd visability
    * #3 måste returnera något inkl void
    * #4 if inside main add static*/

    public static void main(String[] args) {
        addition();

    }

    private static int inputInt(String header){
        Scanner input = new Scanner(System.in);
        System.out.println(header);
        int x = input.nextInt();
        System.out.println("");
        return x;

    }

    private static void addition(){
        int x = inputInt("Enter your first number");
        int y = inputInt("Input your last number");
        int i = x+y;
        System.out.println("Your numbers are " + i + " together!");
    }




}
