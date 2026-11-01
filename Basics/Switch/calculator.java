
import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int a = 10;
        int b = 7;
        
        System.out.println("enter Anyone operator ( + , - , * , / , % ) :  " );
        char op = sc.next().charAt(0);

        switch (op){

            case '+':
                System.out.println(" A + B = " + (a + b));
                break;
            case '-':
                System.out.println("a - b = " + (a - b));  
                break; 
            case '*':
                System.out.println("a * b = " + (a * b));  
                break;
            case '/':
                System.out.println("a / b =  " + (a / b));  
                break;
            case '%':
                System.out.println("a % b = " + (a % b));  
                break;

        }
        sc.close();
    }
}