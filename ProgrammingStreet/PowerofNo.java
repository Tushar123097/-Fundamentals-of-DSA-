//package ProgrammingStreet;

import java.util.Scanner;

public class PowerofNo {
    public static void main(String[] args) {
        System.out.println("Enter a Base:");
        System.out.println("Enter a Exponent:");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();//Input 1
        int exponent = sc.nextInt();//Input 2

    //int base = 2;
    //int exponent = 3;
    int result = 1;//Intialize
    while (exponent>0) {//3>0 2>0 1>0
        result = result*base;//1*2=2 2*2=4 4*2=8
        exponent--;//2 1
    }
    System.out.println("Power of Number="+result);//8
    }
    
    
}
