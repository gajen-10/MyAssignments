package org.testleaf.week1.day2;

public class FibonacciSeries {

    public static void main(String[] args) {
        int i=0;
        int j=1;

        for(int n=0;n<8;n++)
        {
            System.out.print(i+" ");
            int L=i+j;
            
            i=j;
            j=L;

        }
    }
}
