package ifelseLadder;
import java.util.Scanner;

public class incomeTaxSlabChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income;
        System.out.println("Enter your income : ");
        income = sc.nextInt();

        if(income <= 250000){
            System.out.println(" 0 % tax ");
        }
        else if( income <= 500000){
            System.out.println("10 % tax");
        }
        else if( income <= 1000000){
            System.out.println("10 % tax");
        }
        else{
            System.out.println("30 % tax ");
        }

        sc.close();
    }
}
