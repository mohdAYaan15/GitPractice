import java.util.Scanner;

public class binomialCoefficient {

    public static int factorial(int n ){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int biCoefficient(int n , int r){

        int n_fact  = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int coefficient = n_fact/r_fact*(nmr_fact);

        return coefficient;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of n : ");
        int n = sc.nextInt();

        System.out.print("enter value of r : ");
        int r = sc.nextInt();

        int result =  biCoefficient(n, r);

        System.out.println(result);

        sc.close();
    }
}
