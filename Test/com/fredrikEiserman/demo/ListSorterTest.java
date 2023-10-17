package com.fredrikEiserman.demo;

import com.fredrikEiserman.demo.Puzzle2.ListSorter;

class ListSorterTest {

    public static ListSorter ls = new ListSorter(10);

    public static void main(String[] args) {

        ls.printList();

        ls.sortListReverseOrder();

        ls.printList();
    }
}