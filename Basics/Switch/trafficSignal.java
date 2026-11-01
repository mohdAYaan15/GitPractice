
import java.util.Scanner;

public class trafficSignal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter Traffic Signal colour : ");
        String colour = sc.next().toLowerCase();

        switch(colour){
            case "red":
                    System.out.println("Stopppp");
                    break;

            case "yellow":
                    System.out.println("Get Ready !");
                    break;

            case "green": 
                    System.out.println("Go");
                    break;

            default : System.out.println("invalid colour !");
        }


        sc.close();
    }
}