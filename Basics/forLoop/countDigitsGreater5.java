
import java.util.Scanner;

public class countDigitsGreater5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int count = 0;

        for(int i = num; i > 0; i = i / 10){
            int lastDigit = i % 10;
            if(lastDigit > 5){
                count++;
            }
        }

        System.out.println(count);
        
        sc.close();
    }
}
