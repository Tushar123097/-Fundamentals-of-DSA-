//package ProgrammingStreet.PsTwo.java;

import java.util.Scanner;

public class PalidromrRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range1:");
        
        int num1 = sc.nextInt();//Input 1
        System.out.println("Enter The Range2:");
        int num2 = sc.nextInt();//Input 2
       
        
        //int num1 =1;
        //int num2 =100; 
        for(int i = num1; i<num2; i++)//1<100
        {
          int n = i;//1
          int rev = 0;//0
          while (n>0) //1>0
          {
            int digit = n%10;//1%10=1
            rev = (rev * 10) + digit;//0*10+1=1
            n = n/10;//1/10=0

            
          }
          if (rev==i)//1==1
          {
            System.out.println(i);//1
          }
        }
    }
}

 
