import java.util.Scanner;

public class countOddDigits {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("enter a number : ");
    int num = sc.nextInt();

    int count = 0;

    for(int i = num; i > 0; i = i / 10){
        int LastDigit = i % 10;
        if(LastDigit % 2 != 0){
            count++;
        }
    }
    System.out.println(count);


    sc.close();
   } 
}
