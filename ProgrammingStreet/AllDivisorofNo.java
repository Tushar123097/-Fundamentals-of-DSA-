//package ProgrammingStreet;

import java.util.Scanner;

public class AllDivisorofNo {
    public static void main(String[] args) {
        System.out.println("ENTER ANY NUM:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int num = 12;
        for (int i = 1; i <=num; i++) 
        {
            if (num%i==0) 
            {
               System.out.print(i+" ");

                
            }
            
            
        }
    }
    
}
