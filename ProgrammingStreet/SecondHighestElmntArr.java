//package ProgrammingStreet;

public class SecondHighestElmntArr {
    public static void main(String[] args) {
        //WIPRO CAPGIMINI INFOSYS QS//
        int arr[] = {10,20,4,45,99};
        int highest = Integer.MIN_VALUE;//4
        int second_highest = Integer.MIN_VALUE;//10
        for(int i = 0; i<arr.length; i++)//0<5 1<5 2<5 3<5 4<5
        {
            if (arr[i]>highest)//10>4||20>10||4!>20||45>20||99>45
            {
                second_highest = highest;//4||10||20||45
                highest = arr[i];//10||20||45||99
                
            }
            if (arr[i]<highest && arr[i]>second_highest)//10<10&&10>4||20<20&&20>10 
            {                                           //45<45&&45>20||99<99&&99>45
                second_highest = arr[i];//2 0 1 3
                
            }

        }
        System.out.println("Second Highest Element is:"+second_highest);

    }
    
}
