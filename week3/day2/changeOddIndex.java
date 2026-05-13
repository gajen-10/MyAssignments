package org.testleaf.week3.day2;

public class changeOddIndex {
    public static void main(String[] args) {
         String test="changeme";

    char testarr[]=test.toCharArray();

    for(int i=0;i<testarr.length;i++){
        if(i%2!=0){
           
           System.out.print(Character.toUpperCase(testarr[i]));
        }else
            {
            System.out.print(testarr[i]);
        }
    }
    }
   

}
