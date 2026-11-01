package doWhile;
import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password = "Ayaan@123";
        String input;

        do{
            System.out.print("Enter your password : ");
            input = sc.nextLine();
        }
        while(!input.equals(password));

        sc.close();
    }
}
