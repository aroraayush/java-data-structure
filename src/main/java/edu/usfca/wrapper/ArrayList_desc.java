package edu.usfca.wrapper;

import java.util.ArrayList;

public class ArrayList_desc {
    public ArrayList_desc() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        for(Integer a: arrayList){
            System.out.println("a "+a);
        }
        System.out.println("ayush");
    }
}
