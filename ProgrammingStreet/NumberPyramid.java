//package ProgrammingStreet;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        System.out.println("Enter any num:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <=num; i++)//1<=4  2<=4 3<=4 4<=4
        {
            for (int j = 1; j <=i; j++)//1<=1||1<=2 2<=2||1<=3 2<=3 3<=3||1<=4 2<=4 3<=4 4<=4
            {
              System.out.print(j+"");//1 ||1 2||1 2 3||1 2 3 4
              
                
            }
            System.out.println();//new line||nl||nl
            
        }
    }
    
}
