
import java.util.Scanner;

public class calculator {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number : ");
    int a = sc.nextInt();

    System.out.print("Enter the operator (+, -, *, /, %) : ");
    String operator = sc.next();

    System.out.print("Enter the second number : ");
    int b = sc.nextInt();

    if(operator.equals("+")){
        System.out.println("The sum is : " + (a + b));
    }
    else if(operator.equals("-")){
        System.out.println("the difference is : " + (a - b));
   }
   else if(operator.equals("*")){
    System.out.println("the product is : " + (a * b ));
   }
   else if(operator.equals("/")){
     System.out.println(" the quotient is : " + (a /b));
   }
   else{
    System.out.println("enter a valid operator  ");
   }


    sc.close();

   }
}