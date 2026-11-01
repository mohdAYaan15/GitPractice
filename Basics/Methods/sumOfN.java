import java.util.Scanner;

public class sumOfN {

    public static int calculateSum(int n ){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you number : ");
        int n = sc.nextInt();

        System.out.println(calculateSum(n));

        sc.close();
    }
}
