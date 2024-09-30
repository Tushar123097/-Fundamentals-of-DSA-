//package ProgrammingStreet.PsTwo.java;

public class SecSmlstElinArr {
    public static void main(String[] args) {
               //TCS INTERVIEW QS//
        int arr [] = /*{1,2,3,4,5}*/ {12,13,1,10,34,1};
                  
        int min = Integer.MAX_VALUE;//9999
        int Sec_min = Integer.MAX_VALUE;//9999
        for(int i = 0; i<arr.length; i++)//0 1 2 3 4 5
        {
          if (arr[i]<min)//12<9999 1<12 
          {
            Sec_min = min;//9999 12
            min = arr[i];//12 1
          }else if (arr[i]<Sec_min && arr[i]!=min)// 13<9999 10 && 13!=12 ||10<13 && 10!=1|| 34!<10F||1<10 && 1!= 1F 
          {
            Sec_min = arr[i];//13 10
          }
        }
        System.out.println("THE SEC LARGEST ELEMENT IN  ARR IS : "  +Sec_min);//10
    }
    
}
