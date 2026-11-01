import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the rectangle : ");
        float length = sc.nextFloat();

        System.out.println("Enter width of the rectangle : ");
        float width = sc.nextFloat();

        float area = length * width;
        float perimeter = 2*(length + width);

        System.out.println("area of rectangle : " + area );
        System.out.println("perimeter of rectangle : " + perimeter);

        sc.close();
    }
}
