import java.util.Scanner;

public class largest {

    static void findLargest(int a , int b , int c){
         if(a > b && a > c){
            System.out.println(a + " is largest ");
         }
         else if(b > a && b > c){
            System.out.println( b + " is largest ");
         }
         else{
            System.out.println(c + " is a largest ");
         }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();

        findLargest(num1,num2,num3);
    
        sc.close();
    }
}
