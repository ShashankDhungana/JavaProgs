package Chapter4;

import java.util.Locale;
import java.util.Scanner;

public class MiniProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

//            System.out.print("Enter first number : ");
//            int first = sc.nextInt();
//            System.out.print("Enter second number : ");
//            int second = sc.nextInt();
            int bhada = sudip(12,12,12);
            System.out.println("Sum is :"+ bhada);
            ch = sc.next().toLowerCase().charAt(0);
    }

    public static int sudip(int first,int second,int third) {
        return first+second+third;

    }
}
