//package ProgrammingStreet.PsTwo.java;

public class StringSumDigit {
    public static void main(String[] args) {
        String str = "Thenumberare12and34is";
        String num ="";
        int sum = 0;//0
        for(int i = 0; i<str.length();i++)//0 to 13<19 to 17<19
        {
          if (Character.isDigit(str.charAt(i)))//12 || 34
          {
            num = num + str.charAt(i);//12 ||34
          }else
          {
            if (!num.equals("")) {
                sum = sum + Integer.parseInt(num);//12+34
                num = "";

            }
          }
        }
        System.out.println("THE SUM OF STRING IN DIGIT IS = "  +sum);//46
        
    }
    
}
