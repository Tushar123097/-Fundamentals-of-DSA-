//package ProgrammingStreet;

import java.util.Scanner;

public class PasclesTriangle {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//Input
            //ROW//
        for (int i = 0; i < num; i++) {// LETNUM=3;0<3||1<3 2<3
                //SPACES//
            for(int j = 0; j<num; j++){//0<3 1<3 2<3||1<3 2<3 ||2<3
                System.out.print(" ");//    

            }
                //NUMBER//
            int number= 1;//1
            
            for(int k = 0; k<=i; k++){//0<=0 ||0<=1 1<=1 ||0<=2 1<=2 2<=2
                System.out.print(number+" ");//1 
                                             //1 1
                                             //1 2 1
                number = number * (i-k)/(k+1);//||FARMULA||//0 ||(1-0)/1=1||(2-0)/1=2 (2-1)/1=1 
            }
            System.out.println();//new line
        }
        //System.out.println();
    
    }
}
        
            
    
