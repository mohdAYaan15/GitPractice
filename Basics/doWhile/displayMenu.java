package doWhile;
import java.util.Scanner;

public class displayMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("1. pizza");
            System.out.println("2. Burger ");
            System.out.println("3. momos");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

        }while(choice != 3);
        
        sc.close();
    }
}
