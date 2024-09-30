//package ProgrammingStreet.PsTwo.java;

public class TableinRange {
    public static void main(String[] args) {
        for(int i =2; i<=4; i++)//2<=4
        {
         for(int j = 2; j<=4; j++)//2<=4 3<=4 4<=4||2<=  
         {
          //System.out.printf("%-2d * %-2d = %-3d  ",j, i, (i*j));//(2*2)(2*2)(2*3(2*4))
          System.out.print(j+" * " +i+ " = "+(j*i)+ "   " );
         }
         System.out.println();
        }
    }
    
}
