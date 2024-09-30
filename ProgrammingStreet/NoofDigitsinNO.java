//package ProgrammingStreet;

import java.util.Scanner;

public class NoofDigitsinNO {
    public static void main(String[] args) {
        System.out.println("Enter any no:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//Input
        //int num = 12345;
        int count=0;//0
        while (num>0) //12345
        {
          num = num/10;//12345/10=1234 1234/10=123 123/10=12 12/10=1 1/10=0
          count++; //1+1+1+1+1=5
        }
        System.out.println("NO OF DIGITS:"+count);//5
    }
    
}
