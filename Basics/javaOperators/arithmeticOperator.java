
import java.util.Scanner;


public class arithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("enter Second number : ");
        int num2 = sc.nextInt();

        System.out.println("Addtion : " + (num1 + num2));
        System.out.println("susbtraction : " + (num1 - num2));
        System.out.println("Multiplcation: " + (num1 * num2));
        System.out.println("Division : " + ( num1 / num2));
        System.out.println("Modulus : " + ( num1 % num2));

        sc.close();
    }
}
