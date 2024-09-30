//package ProgrammingStreet;
/**
 * ModeofNumber
 */
public interface ModeofNumber {

    public static void main(String[] args) {
        int maxcount=0,mode=0,count=0;
        int arr[]={1,2,2,3,4,4,4};
        for (int i = 0; i < arr.length; i++)//0<7 1<7.. 4<7 to 6<7
        {
            count=0;//0
            for (int j = 0; j < arr.length; j++)//0<7 1<7to 6<7||0<7 1<7 2<7to 6<7||0<7 to 4<7 5<7 6<7
            {
                if (arr[i]==arr[j])//1==1 1==2to1==4||2==1 2==2 2==2to2==4||4==1 to 4==4 4==4 4==4
                {
                    count++;//1||1+1||1+1+1
                    
                }
                
            }
            if (count>maxcount)//1>0||2>1||3>2
            {
                mode=arr[i];//1 2 4
                maxcount=count;//1 2 3
                
            }
            
        }
        System.out.println("MODE IS="+mode);//4
        
    }
}