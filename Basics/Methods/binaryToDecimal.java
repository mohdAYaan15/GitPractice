import java.util.Scanner;

public class binaryToDecimal {

    public static void binToDec(int binNum){
        int decNum = 0;
        int pow = 0 ;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2 , pow));
            pow++;
            binNum =binNum/10;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        int n = sc.nextInt();

        binToDec(n);

        sc.close();
    }
}
