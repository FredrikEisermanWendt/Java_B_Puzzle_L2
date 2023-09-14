package com.Fredrik.demo;

public class Övningar {
    public static void main(String[] args) {

        // övning 1
        int age = 17;

        if(age < 18 ){
            System.out.println("Underage");
        }


        //Övning 2
        age = 18;

        if (age < 18){
            System.out.println("Underage");
        }else{
            System.out.println("Adult");
        }


        //Övning 3

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //Övning 4
        int index = 10;
        if (index == 10){
            System.out.println("index is 10");
        }else{
            System.out.println("index is not 10");
        }


        //Övning 5
        String name = "Anton";

        switch (name){
            case "Benny":
                System.out.println("This is not Anton");
                break;
            case "Anton":
                System.out.println("This is Anton!");
                break;
            default:
                System.out.println("This is someone else");
                break;
        }

        //Övning 6
        adultChecker();
        counter();
        antonChecker("Anton");
        antonChecker("Benny");
        antonChecker("Kalle");



    }

    //Övning 6

    public static void adultChecker(){
        int age = 18;

        if (age < 18){
            System.out.println("Underage");
        }else{
            System.out.println("Adult");
        }


    }

    public static void counter(){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);

        }
    }

    public static void antonChecker(String name){

        switch (name){
        case "Benny":
            System.out.println("This is not Anton");
            break;
        case "Anton":
            System.out.println("This is Anton!");
            break;
        default:
            System.out.println("This is someone else");
            break;
    }

    }


}
