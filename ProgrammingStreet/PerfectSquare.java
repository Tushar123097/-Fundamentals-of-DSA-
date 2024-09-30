//package ProgrammingStreet;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int n =16;
        boolean sqare = false;
        for (int i = 1; i <= num; i++) {//1<=4 2<=2
            if (i*i==num)//1*1==4 2*2==4
            {
                System.out.println("THE PERFECT NO IS="+i);//2
               sqare = true;

                
            }
            
        }
        
    }
    
}
