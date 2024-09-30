//package ProgrammingStreet;

import java.util.Arrays;
import java.util.Scanner;

public class MedianofArray {
    public static void main(String[] args) {//TCS NQT 2024
         int arr [] = {3,1,2,4,5};
           //int arr [] = {2,5,1,7};
        Arrays.sort(arr);//{1,2,5,7}
        if (arr.length%2!=0) {//4%2=0
          int  idx = arr.length/2;
            System.out.println("Median="+arr[idx]);
            
         }else{
            int  idx = arr.length/2;//4/2=2
            double md = (double)(arr[idx]+arr[idx-1])/2;//5+2/2=3.5
            System.out.println("Median ="+md);//3.5
            
        }
    }
    
}
