//package ProgrammingStreet.PsTwo.java;

public class LargestPrimeFactr {
    public static void main(String[] args) {
               //MEDIUM//
         //GOOGLE MS FB UBER QS//
       int n = 28;//28
      for(int i = 2;i*i<=n; i++)//4<=28 
      {
        if (n%i==0)//28%4==0
        {
            int largest_Fact = i;//4
            while (n%i==0)//28%4==0 
            {
                n = n/i;//28/4==7
            }
        }
        if (n>1)//7>1 
        {
            System.out.println("LARGEST PRIME FACTOR = "  +n);//7
        }
      }
    } 
}
