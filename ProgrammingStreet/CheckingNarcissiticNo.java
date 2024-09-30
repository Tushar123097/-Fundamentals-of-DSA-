//package ProgrammingStreet;

import java.util.Scanner;

public class CheckingNarcissiticNo {
    public static void main(String[] args){
        System.out.println("Enter any input:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//Input 
        int rem,sum = 0;//num=153;
        int temp = num;//store it aage compare karna hai
        while (num>0)//153 let this no 
        {
            rem = num%10;//153%10=3 15%10=5 1%10=1
            num = num/10;//153/10=15 15/10=1 1/10=0
          sum = sum + rem*rem*rem;//0+3*3*3=27 27+5*5*5=152 152+1=153   
        }
        if (temp==sum) //153=153
        {
          System.out.println("Num is narcissitic"); //yes it is 
        }else{
            System.out.println("Num is not narcissitic");
        }
    }
}
    
     
        

    

