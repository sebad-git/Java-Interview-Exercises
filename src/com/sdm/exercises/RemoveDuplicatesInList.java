package com.sdm.exercises;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInList {

    /**
     * Write a Program to remove duplicates in an ArrayList.
     * @param args
     * @author sdm
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        System.out.print("Array Before:");
        printList(myList);
        System.out.println(" ");
        myList = removeDuplicates(myList);
        System.out.print("Array After:");
        printList(myList);
    }

    private static List removeDuplicates (List<Integer> myList){
        if(myList==null || myList.isEmpty()){return new ArrayList(); }
        // Use a Set that does not allow duplicates.
        Set<Integer> entriesWithoutDuplicates = new LinkedHashSet<>(myList);
        myList.clear(); myList.addAll(entriesWithoutDuplicates);
        return myList;
    }

    private static void printList(List<Integer> myList){
        System.out.print("[");
        for (Integer number:myList) { System.out.printf("%d,",number); }
        System.out.print("]");
    }

}
