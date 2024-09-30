//package ProgrammingStreet;

import java.util.Scanner;

public class LengthofStringWithoutbuiltmthd {
    public static void main(String[] args) {
        //  WITHOUGHT USING BUILT IN MTHD OR FNCTN //
        System.out.println("Enter any string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String str = "hello";
        System.out.println("THE length of STRING="+str.toCharArray().length);
        System.out.println("THE length of STRING="+str.lastIndexOf(""));
        int l = new StringBuilder(str).length();
        System.out.println("THE length of STRING="+l);
        System.out.println("THE length of STRING="+str.split("").length);

        
    }
    
}
