//package ProgrammingStreet.PsTwo.java;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        //int num = 123;
        int sum = 0;
        while (num>0) 
        {
            sum = num%10 + sum;
            num = num/10;
            
        }
        System.out.println("Sum of Digits:"+sum);
    }
    
}
