
import java.util.Scanner;

public class restaurantMenu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int pizza = 200;
        int burger = 100;
        int momos = 50;
        int tikki = 30;

        System.out.println("====== Restaurant Menu ======");

        System.out.println("1 : pizza = 200");
        System.out.println("2 : burger = 100");
        System.out.println("3 : momos = 50");
        System.out.println("4 : tikki = 30");


        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        System.out.println("Enter your Quantity : ");
        int qt = sc.nextInt();

        int bill = 0;


        switch(choice){

            case 1:  bill = qt * pizza;
                    System.out.println("your total Bill : " + bill);
                    break;

            case 2:  bill = qt * burger;
                    System.out.println("your total Bill : " + bill);
                    break;
            
            case 3:  bill = qt * momos;
                    System.out.println("your total Bill : " + bill);
                    break;

            case 4:  bill = qt * tikki;
                    System.out.println("your total Bill : " + bill);
                    break;

            default : System.out.println("Invalid Choice : ");
        }

        sc.close();

    }
}