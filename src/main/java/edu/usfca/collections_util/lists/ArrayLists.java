package edu.usfca.collections_util.lists;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public ArrayLists() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);

        out.println("===== primitive to ArrayList conversion (Arrays.asList(primitive_arr))======");
        int[] arr1 = new int[]{3,4,5};
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i: arr1){
            list2.add(i);
        }
        out.println(list2);

        out.println("\n===== asList doesn't work with ArrayList ======");
        // Will not work
        // ArrayList<Integer> list3 = Arrays.asList(6,7, 8);
           List<Integer> list3 = Arrays.asList(6,7, 8);
           out.println(list3);
        
        out.println("===== addAll (Collections)======");
        Integer[] arr2 = {6 , 7};

        // Existing ArrayList and List cannot be added directly
        boolean b =  Collections.addAll(arrayList, arr2);
        out.println("Added - " + b);
        out.println(arrayList);

        out.println("===== max in Arrays (Collections)======");
        out.println(Collections.max(arrayList));
    }
}
