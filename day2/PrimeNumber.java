package org.testleaf.week1.day2;

public class PrimeNumber {

    public static void main(String[] args) {
        int i=19;
        Boolean prime=true;

        for(int j=2;j<i;j++)
        {

            if(i%j==0){
                //System.out.println("It is not prime number");
                prime=false;
                break;
            }
            //prime=true;
        }
       if (prime==true) {
        System.out.println("It is Prime number");
        
       }else{
        System.out.println("It is not prime number");
       }
    }
}
