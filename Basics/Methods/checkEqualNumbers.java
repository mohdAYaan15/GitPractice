import java.util.Scanner;

public class checkEqualNumbers{

    static boolean checkEquals(int a , int b){
        if(a == b){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second number : ");
        int b = sc.nextInt();

        System.out.println(checkEquals(a, b));

        sc.close();
    }
}