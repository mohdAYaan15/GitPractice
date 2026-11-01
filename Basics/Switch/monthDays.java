import java.util.Scanner;

public class monthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Month : ");
        int month = sc.nextInt();

        sc.close();

        switch(month){

            case 1 ,3, 5, 7, 8, 10, 12: System.out.println("this month has 31 Days . ");
            break;

            case 4, 6, 9, 11 : System.out.println("this month has 30 days .");
            break;

            case 2: System.out.println("Enter year : ");
                    int year = sc.nextInt();
                    
                    if(year % 400 == 0){
                        System.out.println("this month has 29 Days");
                    }
                    else{
                        System.out.println("this month has 28 days");
                    }

            
           default: System.out.println("enter valid month ! ");
        }
    }
}
