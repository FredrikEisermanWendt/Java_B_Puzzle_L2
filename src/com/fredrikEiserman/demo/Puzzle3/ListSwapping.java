package com.fredrikEiserman.demo.Puzzle3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListSwapping {

    private List<Student> studentList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public ListSwapping(){
        Student benny = new Student("Benny");
        Student frida = new Student("Frida");
        studentList.add(benny);
        studentList.add(frida);
    }

    public void swapStudentsInList(){
        int x = getStudentIndex();
        int y = getStudentIndex();
        Collections.swap(studentList, x, y);
    }

    private int getStudentIndex() {
        System.out.println("Write name of Student");
        String name = scan.nextLine();
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    public void printList(){
        System.out.println(studentList);
    }


}
