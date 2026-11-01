import java.util.Scanner;

public class checkNumber {

    public static boolean testNumber(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter any number you want to check even or odd : ");
       int n = sc.nextInt();

        System.out.println(testNumber(n));

       sc.close();
    }
}
