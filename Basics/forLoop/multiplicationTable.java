import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter any no . you want to print multiplication table : ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int multiply = n * i;
            System.out.println(" 5 * " + i + " = " + multiply);
        }
        sc.close();
    }
}
