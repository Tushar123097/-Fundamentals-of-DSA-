//package ProgrammingStreet.PsTwo.java;

public class Diamond {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++)//0<5 1<5
        {
            for(int k = 3; i<=k; k--)//0<=3 0<=2 0<=1 0<=0||1<=3 1<=2 1<=1
            {
                System.out.print(" ");//         
            }
            for(int j = 1; j<=i;j++)//1!<=0||1<=1 
            {
                System.out.print("* ");//    *
            }                            //  * 
            System.out.println();//new line
        }
                //REVERSE//
        for(int i = 1; i<5; i++)
        {
            for(int k = 1; k<=i; k++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<5-i; j++)
            {
             System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
