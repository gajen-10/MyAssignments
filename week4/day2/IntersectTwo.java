package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class IntersectTwo {
public static void main(String[] args) {
    List<Integer> firstli=new ArrayList<Integer>();
    List<Integer> secondli=new ArrayList<Integer>();

    firstli.add(3);
    firstli.add(2);
    firstli.add(11);
    firstli.add(4);
    firstli.add(6);
    firstli.add(7);

    secondli.add(1);
    secondli.add(2);
    secondli.add(8);
    secondli.add(4);
    secondli.add(9);
    secondli.add(7);
    System.out.println("Number common in both list: ");
    if(firstli.size()==secondli.size()){
        for(int i=0;i<firstli.size();i++){
           for(int j=0;j<secondli.size();j++){
            if(firstli.get(i)==secondli.get(j)){
                System.out.println(firstli.get(i));

            }

           } 
            
        }
    }
}
    

}
