//package ProgrammingStreet;

import java.util.Scanner;

public class SumofPrimeFactors {
    public static void main(String[] args) {
        System.out.println("Enter num:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int num=12 ;, 
        int sum = 0, k = 0;
        for(int i = 1; i<=12; i++)//2<=12 3<=12!!Direct Factor Se Dry Run karo!!
        {
            if (num%i==0)//12%2==0||12%3==0
            {
              for (int j = 1; j <= i; j++)//1<=2 2<=2||1<=3 2<=3 3<=3
              {
                if (i%j==0)//2%1==0 2%2==0||3%1==0 3%2!==0 3%3==0
                {
                    k++;//1+1||1+1
                    
                }
                
              }
              if (k==2)//k==2 || k==2
              {
                sum = sum + i;//0+2=2 || 2+3=5
                
              } 
              System.out.println("Factors"+i);//For Factor of num
            }
            k=0;//0 Intialize to outer loop;

        }
        System.out.println("Oringinal num:"+num);//12
        System.out.println("Sum of Prime Factor:"+sum);//5
    }
    
}
