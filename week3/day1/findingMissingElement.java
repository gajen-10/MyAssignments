package org.testleaf.week3.day1;

import java.util.Arrays;

public class findingMissingElement {

    public static void main(String[] args) {
        int arr[]={1,4,3,2,8,6,7};
        Arrays.sort(arr);
        int n=0;


        for(int i=1;i<arr.length;i++)
        {
           
            //  for(int j=1;j<n-1;j++)
            //  {
                if(arr[n] != i)
                {
                    
                 System.out.println(i);
                 break;
                }
             n++;
             //break;
                //else{break;}
            //  }
            //System.out.println(i);
        }
      
            
        }
            
        
        
        
    }


