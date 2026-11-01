import java.util.Scanner;

public class CountEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no you want to check Even digits : ");
        int num = sc.nextInt();

        int count = 0;

        for(int i = num; i > 0; i = i / 10){
            int digit = i % 10;
            if( digit % 2 == 0){
                count ++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
