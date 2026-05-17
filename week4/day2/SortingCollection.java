package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class SortingCollection {

    public static void main(String[] args) {
        List<String> srt=new ArrayList<String>();
        
        srt.add("HCL");
        srt.add("Wipro");
        srt.add("Aspire Systems");
        srt.add("CTS");
        //System.out.println(srt);
        for(int i=0;i<srt.size();i++){
            for(int j=srt.size()-1;j>=0;j--)
            {
                if(srt.get(i).compareTo(srt.get(j))>0)
                {
                    String temp=srt.get(i);
                    srt.set(i, srt.get(j));
                    srt.set(j,temp);

                }
            }    
            //System.out.println(srt.get(i));

        }
        System.out.println(srt);
        
    }

}
