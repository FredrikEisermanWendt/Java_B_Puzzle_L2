package com.fredrikEiserman.demo;

import com.fredrikEiserman.demo.Puzzle1.ShoppingList;

class ShoppingListTest {

    private static ShoppingList shList = new ShoppingList();

    public static void main(String[] args) {

        shList.addProduct();
        shList.addProduct();

        shList.printList();

        shList.removeProduct();

        shList.printList();

        shList.removeProduct();

        shList.printList();


    }

}