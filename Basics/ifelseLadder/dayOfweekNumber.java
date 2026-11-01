package ifelseLadder;
import java.util.Scanner;

public class dayOfweekNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day ;
        System.out.println("enter day number : ");
        day = sc.nextInt();

        if(day == 1){
            System.out.println("Monday ! ");
        }
        else if( day == 2){
            System.out.println("tuesday ! ");
        }
        else if( day == 3){
            System.out.println("wednesday ! ");
        }
        else if( day == 4){
            System.out.println("thursday ! ");
        }
        else if( day == 5){
            System.out.println("Friday ! ");
        }
        else if( day == 6){
            System.out.println("Sunday ! ");
        }
        else {
            System.out.println(" enter valid  day ! ");
        }


        sc.close();
    }
}
