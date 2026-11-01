import java.util.Scanner;

public class squareOfN {

    public static int calculateSquare(int n ){
        return n * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(calculateSquare(n));

        sc.close();
    }
}
