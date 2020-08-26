package edu.usfca.collections_util.lists;

import java.util.ArrayList;

public class Array_List {
    public Array_List() {
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
