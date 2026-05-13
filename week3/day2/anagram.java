package org.testleaf.week3.day2;

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {
        String text1="stops";
        String text2="potss";

        if (text1.length()==text2.length()){
            char text1arr[]=text1.toCharArray();
            char text2arr[]=text2.toCharArray();
            Arrays.sort(text1arr);
            Arrays.sort(text2arr);
            if (text1arr.equals(text2arr)) {
                System.out.println("The given strings are Anagram.");
            }else{
                System.out.println("The given strings are not an Anagram.");
            }

        }else{System.out.println("Lengths mismatch, therefore the strings are not an Anagram");}
    }
}
