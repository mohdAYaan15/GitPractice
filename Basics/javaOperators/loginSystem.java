
import java.util.Scanner;

public class loginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "Ayaan";
        String password = "1234";

        System.out.println("enter username : ");
        String user = sc.nextLine();

        System.out.println("enter passwords : ");
        String pass = sc.nextLine();

        if((username.equals(user)) && (password.equals(pass))){
            System.out.println("login Successful ! ");
        }
        else{
            System.out.println("login Failed ! ");
        }
        sc.close();
    }
}
