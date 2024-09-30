import java.util.Arrays;

public class CheckTwoArraysEqualorNot {
    public static void main(String[] args) {
        
        int a1[] = {1, 22, 55, 9};
        int a2[] = {1, 22, 55, 6};
        //LOGIC1
       boolean status=Arrays.equals(a1, a2);
        if (status== true) {
            System.out.println("arrays are equall");
            
        }
        else{
            System.out.println("arrays are not equall");
        }         
    }
}
       
                 
                
       

    

    

