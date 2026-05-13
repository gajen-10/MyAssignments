package org.testleaf.week3.day2;

import java.util.Arrays;

public class reverseOdd {
public static void main(String[] args) {
    String test = "I am a software tester";
    String[] charArray = test.split(" ");

    for(int i=0;i<charArray.length;i++){
        if(i%2!=0){
            char[] revArray=charArray[i].toCharArray();
            
            for(int j=revArray.length-1; j>=0;j--)
             {
            System.out.print(revArray[j]);
            

            }
            System.out.print(" ");
            
        }else{
        System.out.print(charArray[i]+" ");
        }
    }
}
}
