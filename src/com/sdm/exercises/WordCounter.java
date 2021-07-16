package com.sdm.exercises;

import java.util.HashMap;
import java.util.List;

public class WordCounter {

    /**
     * Find the word count in a string using HashMap Collection.
     * @param args
     * @author sdm
     */
    public static void main(String[] args) {
        HashMap<String, Integer> words = wordCount("bla bla bla something");
        printMap(words);
    }

    private static HashMap<String, Integer> wordCount(String line){
        String[] words = line.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for (String word:words) {
            if(map.containsKey(word)){map.put(word, map.get(word)+1); }
            else{ map.put(word, 1); }
        }
        return map;
    }

    private static void printMap(HashMap<String,Integer> myMap){
        System.out.print("{");
        for (String word:myMap.keySet()) { System.out.printf("%s:%d,",word,myMap.get(word)); }
        System.out.print("}");
    }

}
