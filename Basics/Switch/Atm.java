
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your balance : ");
    int balance = sc.nextInt();

    System.out.println("======ATM MENU=======");
    System.out.println(" 1 . check balance ");
    System.out.println(" 2 . Deposit money  ");
    System.out.println(" 3 . withdrawal money ");
    System.out.println(" 4  change pin ");
    System.out.println(" 5 . Exit");

    System.out.println("Enter your choice : ");
    int choice = sc.nextInt();

    switch( choice){
        case 1: System.out.println("current balance : " + balance );
                break;

        case 2: System.out.println("Enter deposit Money : ");
                int deposit = sc.nextInt();
                balance = deposit + balance;
                System.out.println("your current balance is : " + balance );
                break;

        case 3: System.out.println("Enter withdrawal money : ");
                int withdrawal = sc.nextInt();

                if( balance >= withdrawal){
                    balance = balance - withdrawal;
                    System.out.println("your current balance is : " + balance);
                    System.out.println("=====transaction successful=====");
                }
                else{
                    System.out.println("please enter withdraw amount less than balance ");
                }
                break;

        case 4: System.out.println("Enter your old PIN : ");
                int old_pin = sc.nextInt();
                System.out.println("Enter new PIN : ");
                int new_pin = sc.nextInt();
                System.out.println("Re - enter new PIN : ");
                new_pin = sc.nextInt();

                System.out.println(" PIN Updated ");
                break;

        case 5: System.out.println("=====Exit=====");
                break;

        default: System.out.println("Invalid Choice !");
        
    }

    sc.close();

    }
}
