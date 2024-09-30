//package ProgrammingStreet;

public class ThreenoPrimeCheck {
         //FUNCTION//
    public void prime(int n)//FUNCTION NAME , PARAMTR
    {
        int count = 0;
        for(int i=1; i<=n; i++)
        {
            if (n%i==0) 
            {
                count++;
                
            }

        }
        if (count==2) 
        {
            System.out.println("Prime:"+n);

            
        }else
        {
            System.out.println("Not Prime:"+n);

        }
        

    }
    public static void main(String[] args) {
        ThreenoPrimeCheck obj = new ThreenoPrimeCheck();
        obj.prime(5);
        obj.prime(1);
        obj.prime(7);
    }
    
}
