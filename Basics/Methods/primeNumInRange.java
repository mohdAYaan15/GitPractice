import java.util.Scanner;

public class primeNumInRange {

    public static boolean CheckPrime(int  a){

        boolean isPrime = true;

        for(int i = 2; i <= a-1; i++){
            if(a % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    
    public static void PrimeInRange(int n){
        for(int i = 1; i <= n; i++){
            if(CheckPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your  your lastrange number : ");
        int n = sc.nextInt();

        PrimeInRange(n);

        sc.close();
    }
}
