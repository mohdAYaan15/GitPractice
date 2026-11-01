import java.util.Scanner;

public class findSmallest {

    public static void Smallest(int a , int b , int c){
        if( a < b && a < c){
            System.out.println(a + " is smallest");
        }
        else if( b < c && b < a){
            System.out.println(b + " is smallest ");
        }
        else{
            System.out.println(c + " is smallest");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.print("Enter third number : ");
        int c = sc.nextInt();


        Smallest(a, b, c);

        sc.close();
    }
}
