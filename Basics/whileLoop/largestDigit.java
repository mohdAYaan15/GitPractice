import java.util.Scanner;

public class largestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = 1;;

        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        while(num > 0){

            int lastDigit;
            lastDigit = num % 10;
            num = num / 10;

            if(lastDigit > largest){
                largest = lastDigit;
            }
        }
        System.out.println(largest);

        sc.close();
    }
}
