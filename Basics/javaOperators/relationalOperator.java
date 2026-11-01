
import java.util.Scanner;

public class relationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("true/false : " + (a>b));
         System.out.println("true/false : " + (a<b));
          System.out.println("true/false : " + (a>=b));
           System.out.println("true/false : " + (a<=b));
            System.out.println("true/false : " + (a==b));
             System.out.println("true/false : " + (a!=b));

        sc.close();
    }
}
