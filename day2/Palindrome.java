package org.testleaf.week1.day2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        
        int inp=8228;
        int div=0;
        int rem;
        int rev = 0;
        for(int i=inp;i>0;i/=10)
        {
        rem=i%10; 
        rev=rev*10+rem;
        //inp=inp/10;
        }

        //System.out.println(rev);

        if (inp == rev) {
            System.out.println(inp+" is palindrome");
            
        }else{
            System.out.println(inp+" is not palindrome");
        }

    }

}
