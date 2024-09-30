import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        //int n = 153;
        int n;
        System.out.println("Enter the no:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c = n;//c beacause aage compare karna hai
       int arm = 0;
       while (n>0)//153
        {
      int  rem =    n%10;//153%10=3 15%10=5 1%10=1
        arm = (rem*rem*rem)+ arm;//3*3*3+0=27 5*5*5+27=152 1*1*1+152=153
        n = n/10;//153/10=15 15/10=1 1/10=0
       }
       if (c==arm) //153==153
       {
        System.out.println("no is armstrong");//153
       }
       else{
        System.out.println("no is not armstrong");
       }
    }
}
