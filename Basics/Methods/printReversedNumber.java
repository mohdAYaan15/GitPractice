import java.util.Scanner;

public class printReversedNumber{

    public static int  doReverse(int n ){

        int reverse = 0;
        while( n != 0 ){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter an integer : ");
        int n = sc.nextInt();

        System.out.println(doReverse(n));

        sc.close();
    }
}