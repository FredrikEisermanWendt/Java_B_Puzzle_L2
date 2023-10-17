package com.fredrikEiserman.demo.Puzzle1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    Scanner scan = new Scanner(System.in);

    private List<String> shoppingList = new ArrayList<>();

    public void addProduct(){
        shoppingList.add(inputString("Enter product to add into list").toLowerCase());
    }

    public void removeProduct(){
        shoppingList.remove(inputString("Enter product to remove from list").toLowerCase());
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
