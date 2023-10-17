package com.fredrikEiserman.demo;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListSorter {

    private List<Integer> numberList = new ArrayList<>();
    private Random rand = new Random();


    public ListSorter(int x ){

        for (int i = 0; i < x; i++){

            numberList.add(rand.nextInt(0 ,100) + 1);
        }
    }

    public void sortListReverseOrder(){
        Collections.sort(numberList, Collections.reverseOrder());
    }

    public void printList(){
        System.out.println(numberList);
    }


}
