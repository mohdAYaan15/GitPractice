package ifelseLadder;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int unit;
        System.out.println("Enter your bill units : ");
        unit = sc.nextInt();

        if( unit <= 100){
            System.out.println("$0");
        }
        else if( unit <= 200){
            System.out.println("$100");
        }
        else if( unit <= 300){
            System.out.println("$300");
        }
        else{
            System.out.println("$500");
        }

        sc.close();
    }
}
