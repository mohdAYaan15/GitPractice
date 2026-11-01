package doWhile;
import java.util.Scanner;
public class matchUntil0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int input;
    
        do{
            System.out.print("enter a number : ");
            input = sc.nextInt();
        
        }while(input != 0);

        sc.close();
    }
}