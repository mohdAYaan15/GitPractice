import java.util.Scanner;

public class findLargestDigit {

    public static int findDigit(int n ){
        int largestDigit = 0;
        while(n != 0){
            int currentDigit = n % 10;
            if(currentDigit > largestDigit){
                largestDigit = currentDigit;
            }
            n = n /10;
        }
        return largestDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an number : ");
        int n = sc.nextInt();

        System.out.println(findDigit(n));

        sc.close();
    }
}
