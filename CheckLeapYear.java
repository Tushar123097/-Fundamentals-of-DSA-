import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        //int years = 2020;
        int years;
        boolean leap= false;
        System.out.println("Enter the year:");
        Scanner sc = new Scanner(System.in);
        years = sc.nextInt();
        
        if (years%4==0) {
            if (years%100==0) {
                if (years%400==0);
                leap = true;
                    
                
               
               
                
            }
           leap=true;
            
        }
        
        System.out.println("Year is leap?:"+leap);
        
        
    }
}
