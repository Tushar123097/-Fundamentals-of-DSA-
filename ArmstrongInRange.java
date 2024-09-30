public class ArmstrongInRange {
    public static void main(String[] args) {
        int i = 1, a, b, c;
        //TCS NQT QS
        
        while (i<=500) // 1 153 
        {
            a = i%10;// 1 1%10 = 1 153%10 = 3 to 500 but you have to check only that given range
            b = i%100;// 1%100=0 153%100 = 53
            b = (b - a)/10;// (0-1)/10=0 (53-3)/10=5
            c = i/100;// 1/100=0 153/100 = 1
            if ((a*a*a) + (b*b*b) + (c*c*c)==i)//3*3*3 + 5*5*5 + 1*1*1 ==153
            
                System.out.println(i);//1 153 170 371 407
                i++;//update the values
            
        }
    }
}
