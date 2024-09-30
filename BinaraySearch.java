import java.util.Arrays;

public class BinaraySearch {
   
    public static void main(String[] args) {
         int arr[]={10, 20, 30, 40, 50, 60, 70, 80 };
        boolean flag=false;//for if element is not found return false
        int key = 80;
        int l = 0;
        int h = arr.length-1;//8-1=7
        while (l<=h)//0<=7
         {
            int mid= (l+h/2);//0+7/2=3 4+7/2=5 6+6/2=6 7+7/2=7
            if (arr[mid]==key)//40==80 60==80 70==80 80=80
            {
                System.out.println("Element is found");//found
                flag=true;
                break;
            }
            if (arr[mid]<key)//40<80 60<80 70<80
             {
                l= mid+1;//3+1=4 5+1=6 6+1=7
            }
            if (arr[mid]>key)
             {
                h= mid-1;
            }

        }
        if (flag==false) 
        {
           System.out.println("Element is not found"); 
        }
    }
}
          
        
        
            
       
    

    
   
           




