//package ProgrammingStreet;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        System.out.println("Enter any Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Input
        int num = 1;//1
        for(int i = 1; i <= n; i++)//1<=3 2<=3 3<=3 4<=!3 Exit;
        {
            for(int j = 1; j <= i; j++)//1<=1 1<=2 2<=2 1<=3 2<=3 3<=3 4<=!3
            {
                
                System.out.print(num+ " ");//1
                                           //2 3
                                           //4 5 6
                num++;//2 3 4 5 6 7

            }
            System.out.println();//new line new line

        }
       
    }
    
}
