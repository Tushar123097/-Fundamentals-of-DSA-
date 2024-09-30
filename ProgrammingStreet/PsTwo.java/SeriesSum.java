//package ProgrammingStreet.PsTwo.java;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of n:");
        int n = sc.nextInt();

        //int a = 1;
        //int n = 4;
        double sum = 0;
        for (int i = 0; i < n; i++)//0<4 1<4 
        {
         sum = (sum + (double)a/(i+1));//(FARMULA)0+1/(0+1)=1 1+1/(1+1)
            
        }
        System.out.println("Sum of Series:"+sum);
    }
    
}
