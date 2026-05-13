package org.testleaf.week3.day2;

public class removeDuplicate {
public static void main(String[] args) {
    int count=1;
    String text="We learn Java basics as part of java sessions in java week1";
    char rmvdup[]=text.replace(" ", " ").toCharArray();
    String[] charArray = text.split(" ");
    for(int i=0;i<charArray.length;i++)
    {
       for(int j=1;j<charArray.length;j++) 
        {
        if(charArray[i].toUpperCase()==charArray[j].toUpperCase()){
            charArray[i].replace(charArray[j], " ");
            //System.out.print(" ");
            //rmvdup[i+1].replace(" ")
            break;
        }
        
    }
    System.out.print(charArray[i]+" ");
    
    }
}
}
