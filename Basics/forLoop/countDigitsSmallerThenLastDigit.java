import java.util.Scanner;

public class countDigitsSmallerThenLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        int count = 0;

        for(int i = num; i > 0; i = i / 10){
            int Digit = i % 10;
            if(lastDigit > Digit){
                System.out.println(Digit);
                count++;
            }
        }
        System.out.println("Number counts are : "+ count);
       
        sc.close();
    }
}