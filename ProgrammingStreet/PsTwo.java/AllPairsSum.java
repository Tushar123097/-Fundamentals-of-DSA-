//package ProgrammingStreet.PsTwo.java;

public class AllPairsSum {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        //LOGIC-1//     //DRY RUN//
        int low = 0;//0
        int sum = 5;//5
        int high = arr.length-1;//5-1=4
        while (low<high)//0<4 1<2 2!<1Exit
        {
           if (arr[low]+arr[high]>sum)//1+5=6>5 2+3=5!>5 
           {
            high--;//3
           } else if (arr[low]+arr[high]<sum)//2+3==5!<5
           {
            low--;
           }else if (arr[low]+arr[high]==sum)//2+3=5==5
           {
            System.out.print("("+arr[low]+" ,"+arr[high]+")");//(1, 4)(2, 3)
            low++;//1 2
            high--;//2 1
           }
           


            
            

        }
        //LOGIC-2//
         /*  int sum = 5;
        for (int i = 0; i < arr.length; i++)//0<4 
        {
            for(int j = 0; j<arr.length; j++)//0<4 1<4 2<4 3<4
            {
                if (arr[i]+arr[j]==sum)//1+1!==5 1+2!=5 1+3!=5 1+4==5
                {
                    System.out.println("("+arr[i]+ ","+arr[j]+")");//(1, 4)
                    
                }
            }
            
        }*/
    }
    
}
