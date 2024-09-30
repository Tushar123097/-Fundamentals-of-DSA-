public class CheckPrime {
  
  public static void main(String[] args) {
    int num = 6;
    int count = 0;
    for (int i = 1; i <= num; i++) {//1 2 3 4
      if (num%i==0) {//6%1==0 6%2==0 6%3==0 6%4==0 6%5==0 6%6==0
        count++;//1 2 3 4 5 6
      }
    }
    if (count==2) {
      System.out.println("prime");
    }
    else{
      System.out.println("not prime");//not prime
    }


  }
}
   
   
    
          
          
        

        
       
      
    
   

  
  
  
   
  

           
      
        
        
      
      
      

      
    

