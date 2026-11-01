import java.util.Scanner;

public class countDigit {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter any no . you want to count digits : ");
       int num = sc.nextInt();

       int count = 0;

       for(int i = num; i > 0 ; i = i /10){
         count++;
       }
       System.out.println("Digits in this Number are  : " + count);
       sc.close(); 
    }
}
