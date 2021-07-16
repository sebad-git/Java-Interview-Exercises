package com.sdm.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateLetters {

    /**
     * Write a program that detects the duplicate characters in a string.
     * @param args
     * @author sdm
     */
    public static void main(String[] args) {
        String str = "Java Code Test";
        printDuplicate("Apple Grape Orange");
    }

    private static void printDuplicate(String word){
        if(word==null || word.isEmpty() ){ System.out.println("Word is empty"); return; }
        System.out.printf("Word '%s'", word);
        //Replace empty Spaces and converts String to chars.
        char[] characters = word.replace(" ","").toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        //If character exists add +1 duplicate if not just add the character.
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) { charMap.put(ch, charMap.get(ch) + 1); }
            else { charMap.put(ch, 1); }
        }
        //Display the results.
        System.out.println("\n RESULTS");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.printf("Letter: %s Repeats: %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}
