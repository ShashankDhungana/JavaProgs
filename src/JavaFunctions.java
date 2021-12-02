import java.util.Locale;
import java.util.Scanner;

public class JavaFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.print("Enter first number : ");
            int first = sc.nextInt();
            System.out.print("Enter second number : ");
            int second = sc.nextInt();
            int result = first + second;
            System.out.println("Sum is :"+ result);
            System.out.println("Do you want to continue (Y/N) ?");
            ch = sc.next().toLowerCase().charAt(0);



        } while (ch == 'y');
    }
}
