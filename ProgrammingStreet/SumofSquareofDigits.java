//package ProgrammingStreet;

import java.util.Scanner;

public class SumofSquareofDigits {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        //int number = 123, 
        int rem,sum=0;
        
        while (number>0)//123>0 12>0
        {
            rem = number%10;//123%10=3 12%10=2 1%10=1
            sum = sum + rem*rem;//0+3*3=9 9+2*2=13 13+1*1=14
            number = number/10;//123/10=12 12/10=1 1/10=0
           
        }
        System.out.println("THE SUM OF SQUARE OF DIGITS="+sum);
    }
    
}
