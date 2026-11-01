package ifStatement;
import java.util.Scanner;

public class positiveNoCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
         System.out.println("enter en integer : ");
         num = sc.nextInt();

         if(num > 0){
            System.out.println("positive ! ");
         }

         sc.close();
    }
}
