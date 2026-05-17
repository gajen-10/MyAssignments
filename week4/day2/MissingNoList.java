package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class MissingNoList {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(10);
        num.add(6);
        num.add(8);
        System.out.println(num);
        for(int i=0;i<num.size();i++)
        {
            for(int j=0;j<num.size()-1;j++){
                if(num.get(i)<num.get(j))
                {
                    int temp=num.get(i);
                    num.set(i, num.get(j));
                    num.set(j, temp);


                }
            }
        
        }
        System.out.println(num);
        System.out.println("Missing Number: ");
        for(int x=1;x<num.get(num.size()-1);x++){
           
            if(!num.contains(x))
            {
                System.out.println(x);
                //break;
            }
        
        }

       

    }

    
    



}
