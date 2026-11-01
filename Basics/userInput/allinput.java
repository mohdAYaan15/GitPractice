package userInput;
import java.util.Scanner;


public class allinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter byte : ");
        byte by = sc.nextByte();

        System.out.println("enter short : ");
        short s = sc.nextShort();

        System.out.println("enter int : ");
        int i = sc.nextInt();

        System.out.println("enter float : ");
        float f = sc.nextFloat();

        System.out.println("enter double : ");
        double d = sc.nextDouble();

        System.out.println("enter boolean : ");
        boolean b = sc.nextBoolean();

        System.out.println("enter char : ");
        char c = sc.next().charAt(0);

        System.out.println("Enter string : ");
        String str = sc.next();

        System.out.println("Byte : " + by);
        System.out.println("Short : " + s);
        System.out.println("Int : " + i);
        System.out.println("Float : " + f);
        System.out.println("Double : " + d);
        System.out.println("Boolean : " + b);
        System.out.println("Char : " + c);
        System.out.println("String : " + str);

        sc.close();
    }
}



