import java.util.Scanner;

public class checkPrimeNumber {

    public static boolean checkPrime(int n){
       boolean isPrime = true;

        for(int i = 2; i <= (n-1); i++){
            if(n % i == 0){
               isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(checkPrime(n));

        sc.close();
    }
}
