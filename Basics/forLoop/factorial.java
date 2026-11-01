
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no . you want to find factorial : ");
        int n = sc.nextInt();

        int factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        System.out.println("factorial is : " + factorial);

        sc.close();
    }
}
