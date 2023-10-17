package com.fredrikEiserman.demo;

import java.util.ArrayList;
import java.util.List;

public class NonNegativeList {

    private static List<Integer> positiveList = new ArrayList<>();

    public static List removeNegIntFromList(List<Integer> numList){
        for (Integer i: numList) {
            if (i >= 0){
                positiveList.add(i);
            }
        }
        return positiveList;
    }

}
