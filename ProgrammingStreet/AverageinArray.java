//package ProgrammingStreet;

import java.util.Scanner;

public class AverageinArray {
    public static void main(String[] args) {
        
        double arr[] = /*{1,2,3,4,5};*/{5,3,9,7,1,2};
        double sum = 0;
        for(int i = 0; i<arr.length; i++){//0<5 1<5 2<5 3<5 4<5
            sum = sum + arr[i];//0+1=1 1+2=3 3+3=6 6+4=10 10+5=15
            
        }
        double aver = sum/arr.length;//15/5=3
        System.out.println("AVERAGE IS="+aver);//3.0
    }
    
}
