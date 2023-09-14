package com.fredrik.principles;

public class Container {

    /*todo
     * if()
     * else()
     * switch
     * */

    public void container () {


        int x = 10;
        int y = 15;


        if (x > y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int age = 18;

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are an kid");
        }


        int day = 10; //day of the week starting on monday

        switch (day) {
            case 1:
                System.out.println("Måndag");
                break;
            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 6:
            case 7:
                System.out.println("Helg");
            default:
                System.out.println("FEL!!: Denna dag finns inte");

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }

    }

}
