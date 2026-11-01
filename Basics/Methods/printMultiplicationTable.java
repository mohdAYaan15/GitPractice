import java.util.Scanner;

public class printMultiplicationTable {

    public static void printTable(int n){
        for(int i = 1; i <=  10; i++){
            System.out.println( n * i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter table number : ");
        int num = sc.nextInt();

        printTable(num );

        sc.close();
    }
}
