//package ProgrammingStreet.PsTwo.java;

import java.util.Scanner;
public class SumofFrstNOddntrlNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num:");
        int num = sc.nextInt();
        int sum = num*num;//(FARMULA FOR ODD NTRL NO)
        System.out.println("The Sum of First odd natural num of  "+num+ "is:"+ sum);
    }
}

