import java.util.*;

public class isArmstrong {

    public static int findSum(int n ){

        int sum = 0, pow = 0;
         while(n != 0){
            int lastDigit = n % 10;
            pow = (int)Math.pow(lastDigit, 3);
            sum = sum + pow;
            n = n / 10;
         }
         return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an number : ");
        int  n = sc.nextInt();

        int sum = findSum(n);

        if( n == sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        sc.close();
    }
}
