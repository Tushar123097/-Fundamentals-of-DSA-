//package ProgrammingStreet;

import java.util.Scanner;

public class SumOfOddNo {
    public static void main(String[] args) {
        System.out.println("Enter the firsr No");
        System.out.println("Enter the second No");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();//Input 1
        int num2 = sc.nextInt();//Input 2
        int sum = 0;
        for (int i = 1; i <=num2; i++)//let num2=10 1<=10 3<=10 5<=10 7<=10 9<=10
        {
            if (i%2!=0)//1%2!=0 3%2!=0 5%2!=0 7%2!=0 9%2!=0
            {
              sum = sum + i;//0+1=1 1+3=4 4+5=9 9+7=16 16+9=25
            }
        }
        System.out.println("Sum of ODD NO IS:"+sum);//25
    }
    
}
