//package ProgrammingStreet;

import java.util.Scanner;

public class FactorialDigitsSum {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Input
        int f = 1,sum = 0;//Intialize
        for(int i = 1; i<=n; i++)//let n=3; 1<=3 2<=3 3<=3 4<=!3 Exit
        {
           int fac = f * i;//1 * 1=1 1*2= 2 2*3=6
            sum = sum + f;//0 + 1=1 1+2=3 3+6=9 

        }
        System.out.println("Fac Digit Sum is:"+sum);//9
    }
    
}
