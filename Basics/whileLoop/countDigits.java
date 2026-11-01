import java.util.Scanner;

public class countDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int i = num;
        
        int count = 0;
        while( i > 0){
            count ++;
            i = i/10;

        }
        System.out.println(count);

        sc.close();
        
    }

}