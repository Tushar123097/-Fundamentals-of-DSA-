//package ProgrammingStreet.PsTwo.java;

import java.util.Scanner;

public class AllDivofTwonoProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1:");
        int number1 = sc.nextInt();
        System.out.println("Enter number2:");
        int number2 = sc.nextInt();
        //int number1 = 6;
        //int number2 = 10;
        int prod = number1*number2;
        int j = prod;
        for(int i = 1; i<=j; i++)
        {
           if (j%i==0) 
           {
            System.out.print(i+ " ");
            
           }
           
        }
        
    }
    
}
