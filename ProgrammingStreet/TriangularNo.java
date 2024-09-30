//package ProgrammingStreet;

import java.util.Scanner;

public class TriangularNo {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//Input
        int sum = 0;//0
        //int n=6;
        for (int i = 1; i<=num; i++) //1<=6 2<=6 3<=6
        {
            sum = sum+i;//0+1=1 1+2=3 3+3=6
            if (sum==num)//1==6 3==6 6==6||FIND
            break;
        }
        if (sum==num) {//6==6
        System.out.println(num+": isTriangular");//6 isTringular
        }else{
        System.out.println(num+":No is not Triangular");
        }   
    }
}
        
                
            
            
        
    
    

