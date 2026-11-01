import java.util.Scanner;

public class hotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int single = 2000;
        int Double = 5000;
        int deluxe = 7000;
        int suite = 10000;

        System.out.println("======= Hotel Reservation Menu ========");

        System.out.println("1 : Single room ->");
        System.out.println("2 : Double room ->");
        System.out.println("3 : deluxe ->");
        System.out.println("4 : suite room ->");

        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        System.out.println("Enter no. of Days : ");
        int Days = sc.nextInt();

        int bill = 0;


        switch(choice){
            case 1 : bill = single * Days;
                     System.out.println("your totaL BILL is : " + bill);
                     break;

            case 2 : bill = Double * Days;
                     System.out.println("your totaL BILL is : " + bill);
                     break;

            case 3 : bill = deluxe * Days;
                     System.out.println("your totaL BILL is : " + bill);
                     break;

            case 4 : bill = suite * Days;
                     System.out.println("your totaL BILL is : " + bill);
                     break;


            default : System.out.println("Invalid Choice ");
        }


        System.out.println("MOde of Payment: ");
        System.out.println(" 1 : Cash \n 2 : Card \n 3 : UPI \n");
        int payment = sc.nextInt();


        switch(payment){
            case 1 : System.out.println(" pay through cash your Bill  : " + bill);
            System.out.println(" thank you Visit next Time ");
            break;

            case 2: System.out.println("Enter you card details : ");
            System.out.println("pay now you Bill : " + bill );
            System.out.println(" thank you Visit next Time ");        
            break;

            case 3: System.out.println("Enter you UPI details : ");
            System.out.println("pay now you Bill : " + bill );
            System.out.println(" thank you Visit next Time ");        
            break;

            default : System.out.println("Invalid Mode of payment ! ");
        }
       
        sc.close();
    }
}
