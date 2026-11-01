package ifelseLadder;
import java.util.Scanner;

public class ageCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("Enter your age : ");
        age = sc.nextInt();

        if( age < 13){
            System.out.println("child");
        }
        else if( age < 18 ){
            System.out.println("teenager ! ");
        }
        else if( age < 60){
            System.out.println("Adult");
        }
        else{
            System.out.println(" Senior Citizen ");
        }

        sc.close();
    }
}
