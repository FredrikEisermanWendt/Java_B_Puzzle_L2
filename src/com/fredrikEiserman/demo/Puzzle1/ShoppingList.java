package com.fredrikEiserman.demo.Puzzle1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    Scanner scan = new Scanner(System.in);

    private List<String> shoppingList = new ArrayList<>();

    public ShoppingList(){
        runShoppingList();
        printEndingMessage();
    }

    private void printMeny(){
        System.out.println("Enter 1 to add to list \nEnter 2 to remove from list \nEnter 3 to show list \nEnter 4 to exit");
    }

    private void runShoppingList(){

        while (true){
            System.out.println("");
            printMeny();
            String choice = inputString("Enter your choice");
            switch(choice){
                case "1":
                    addProduct();
                    break;
                case "2":
                    removeProduct();
                    break;
                case "3":
                    printList();
                    break;
                case"4":
                    return;
                default:
                    System.out.println("Error: not an allowed option");
                    break;
            }
        }

    }

    private void printEndingMessage(){
        System.out.println("Bye bye");
    }

    public void addProduct(){
        String temp = inputString("Enter product to add into list").toLowerCase();
        shoppingList.add(temp);
        System.out.println(temp + " was added");
    }

    public void removeProduct(){
        String temp = inputString("Enter product to remove from list").toLowerCase();
        shoppingList.remove(temp);
        System.out.println(temp + " was removed");
    }

    public void printList(){
        System.out.println(shoppingList);
    }

    private String inputString(String header){
        System.out.print(header + ": ");
        String input = scan.nextLine();
        return input;
    }




}
