package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<Integer>();
        li.add(3);
        li.add(2);
        li.add(11);
        li.add(4);
        li.add(6);
        li.add(7);

        for(int i=0;i<li.size();i++)
        {
            for(int j=0;j<li.size();j++){
                if(li.get(i)<li.get(j)){
                    int temp=li.get(j);
                    li.set(j,li.get(i));
                    li.set(i,temp);


                }
            }
        }
        System.out.println(li);
        System.out.println("Second Largest Number: "+li.get(li.size()-2));
    }

}
