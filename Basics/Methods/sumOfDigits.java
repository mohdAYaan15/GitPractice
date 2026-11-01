import java.util.Scanner;

public class sumOfDigits {

    public static int calculateSumOfDigits(int integer){
        int sum = 0;
        int lastDigit;
        for(int i = integer; i >= 0; i++){
            lastDigit = integer % 10;
            sum = sum + lastDigit;
            integer =  integer / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer : ");
        int integer = sc.nextInt();

        System.out.println(calculateSumOfDigits(integer));
        
        sc.close();
    }
}
