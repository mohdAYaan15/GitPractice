package doWhile;
import java.util.*;

public class calculateInputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        int sum = 0;
        
        do{
            System.out.print("Enter a number : ");
            input = sc.nextInt();

            sum = sum + input;

        }while(input != 0);

        System.out.println(sum);

        sc.close();
    }
}
