//package ProgrammingStreet.PsTwo.java;

public class TableofMatrix {
    public static void main(String[] args) {
        for(int i = 1; i<=3; i++)
        {
         for(int j = 1; j<=3; j++)
         {
          System.out.printf("%-2d * %-2d = %-3d  ",j,i, (i*j));
         }
         System.out.println();
        }
    }
    
}
