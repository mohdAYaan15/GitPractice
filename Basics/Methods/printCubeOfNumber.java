import java.util.Scanner;

public class printCubeOfNumber {

    public static int calculateCube(int n){
        return n * n * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        System.out.println(calculateCube(n));

        sc.close();

    }
}
