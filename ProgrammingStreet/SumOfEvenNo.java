//package ProgrammingStreet;

import java.util.Scanner;

public class SumOfEvenNo {
    public static void main(String[] args) {
        System.out.println("Enter First No:");
        System.out.println("Enter Second No:");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();//Input First 
        num = sc.nextInt();//Input Second

        int sum = 0;//0
        for(int i = 1; i<=num; i++)// let num=10: 2<=10 4<=10 6<=10 8<=10 10<=10
        {
            if(i%2==0)//2%2==0 4%2==0 6%2==0 8%2==0 10%2==0
            {
                sum = sum + i;//0+2=2 2+4=6 6+6=12 12+8=20 20+10=30

            }

        }
        System.out.println("Sum of Even no in range:"+sum);//30
    }

    
}