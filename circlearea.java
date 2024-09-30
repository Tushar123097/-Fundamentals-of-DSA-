import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        //int r = 5;
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
