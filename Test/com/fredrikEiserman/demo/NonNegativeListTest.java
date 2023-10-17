package com.fredrikEiserman.demo;


import com.fredrikEiserman.demo.Puzzle4.NonNegativeList;

import java.util.ArrayList;
import java.util.List;

class NonNegativeListTest {


    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        for (int i = -5; i <= 5; i ++){
            numList.add(i);
        }

        System.out.println(numList);

        numList = NonNegativeList.removeNegIntFromList(numList);

        System.out.println(numList);

    }



}