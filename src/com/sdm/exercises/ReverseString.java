package com.sdm.exercises;

public class ReverseString {

    /**
     * Reverse a String.
     * @param args
     * @author sdm
     */
    public static void main(String[] args) {
        String str = "Java Code Test";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
    }

}
