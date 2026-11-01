import java.util.Scanner;

public class isPerfect {
    public static int checkSum(int n ){
        int sum = 0;
        while(n != 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sum = checkSum(n);

        if(n == sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        sc.close();
    }
}
