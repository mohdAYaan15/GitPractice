import java.util.Scanner;

public class isPalindrome{

    public static int reverseNumber(int n){
        int reverse = 0;
        while(n != 0){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number to check Palindrome : ");
        int n = sc.nextInt();

        int reversedNumber = reverseNumber(n);

        if( reversedNumber == n){
             System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        sc.close();
    }
}