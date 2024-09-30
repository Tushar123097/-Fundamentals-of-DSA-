//package ProgrammingStreet;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        System.out.println("Enter any string1:");
        System.out.println("Enter any string2");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sortedstr1 = new String(arr1);
        String sortedstr2 = new String(arr2);
        if (sortedstr1.equals(sortedstr2)) {
            System.out.println("Anagram");
            
        }else{
            System.out.println("not anagram");
        }



        
        

    }
}
