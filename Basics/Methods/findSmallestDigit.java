import java.util.Scanner;

public class findSmallestDigit {
    
    public static int findDigit(int n ){
        int smallestDigit = 9;
        while(n != 0){
            int currentDigit = n % 10;
            if(currentDigit < smallestDigit){
                smallestDigit = currentDigit;
            }
            n = n /10;
        }
        return smallestDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an number : ");
        int n = sc.nextInt();

        System.out.println(findDigit(n));

        sc.close();
    }
}
