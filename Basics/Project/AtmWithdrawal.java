package Project;
import java.util.Scanner;


public class AtmWithdrawal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account balance : ");
       float balance = sc.nextFloat();

        System.out.println("Enter withdrawal amount : ");
        float amount = sc.nextFloat();

        if( amount <= 0){
            System.out.println("insufficient amount ");            
        }
        else if( amount % 100 != 0){
            System.out.println("withdrawal amount must be multiple of 500" );
        }
        else if( amount > balance){
            System.out.println("amount should be less than balance ");
        }
        else if((balance - amount ) < 500){
            System.out.println("remaining balance should be 500 at least ! ");
        }
        else{
            System.out.println("transaction successful");
            balance = balance - amount;
            System.out.println("your current balance is :  " + balance);
            System.out.println("----------- VISIT AGAIN ------------");
        }
        sc.close();
    }
}
