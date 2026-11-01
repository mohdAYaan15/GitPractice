import java.util.Scanner;

public class natualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no. till you want to print natural numbers : ");
        int n = sc.nextInt();

        System.out.println("natural numbers are \n");

        for(int i = 1; i <= n; i ++){
            System.out.println(i);
        }
        sc.close();
    }
}
