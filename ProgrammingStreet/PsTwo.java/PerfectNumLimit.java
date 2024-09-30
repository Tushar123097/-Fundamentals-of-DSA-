//package ProgrammingStreet.PsTwo.java;

public class PerfectNumLimit {
    public static void main(String[] args) {
        int n;     //MEDIUM//              //DRY RUN//
        for(int i = 1; i<=30; i++)//6<=30||PERFECT!28 and 6!
        {
            int sum = 0;//
            for( n = 1; n<i; n++)//1<6 2<6 3<6 Another is 28:
            {
              if (i%n==0)//6%1==0 6%2==0 6%3==0 6%4!==0 6%5!==0
              {
                sum = sum + n;//0+1=1 1+2=3 3+3=6
              }
            }
            if (sum == i)//6==6
             {
               System.out.println("PERFECT NUM :"  +i);//6  
             }
        }
        
    }
}
