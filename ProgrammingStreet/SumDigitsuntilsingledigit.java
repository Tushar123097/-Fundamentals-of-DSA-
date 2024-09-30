//package ProgrammingStreet;

import java.util.Scanner;

public class SumDigitsuntilsingledigit {

    public static void main(String[] args) {
        //AMAZON QS//
        System.out.println("ENTER ANY DIGIT:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//input 
        int sum = 0;//n=9857;
        //Why || or oprtr?because ek condtn sahi dekhkna hai
        //sum>9 because first digit lena hai given Digit se
        while (n>0 || sum>9)//(9857>0||0>9) //(0>0||29>9)//(0>0||11>9)
        {
            if (n==0)//9857//0==0 //0==0
            {
                n = sum;//n = 29 //n = 11
                sum = 0;//0
                
            }
            sum =sum + n%10;//0+9857%10=0+7=7 7+5=12 12+8=20 20+9=29
                            //0+9=9 9+2=11
                            //0+1=1 1+1=2
            n = n/10;//9857/10=985 985/10=98 98/10=9 9/10=0
                     //29/10=2 2/10=0 
                     //11/10=1 1/10=0       
        }
        System.out.println("SINGLE DIGIT SUM IS:"+sum);
        
           
        
    }
}

                
            
           
           
        
        

