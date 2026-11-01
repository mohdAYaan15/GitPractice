import java.util.Scanner;

public class isDIvisible {

    static boolean checkDivisible(int n , int divisor){

        if(n % divisor == 0){
            return true;
        }
        else{
           return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number : ");
        int n = sc.nextInt();

        System.out.println("Enter your divisor : ");
        int divisor = sc.nextInt();

        System.out.println(checkDivisible(n, divisor));

        sc.close();
    }
}
