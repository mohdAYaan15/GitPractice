import java.util.Scanner;

public class collegeadmission {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println(" enter your marks for further deatails !");
            System.out.println("Enter your marks : ");
            int marks = sc.nextInt();

            if(marks >= 40){
                System.out.println("you are eligible to admission ");
            }
            else{
                 System.out.println("you are not eligible to admission ");
            }
        }
        else{
             System.out.println(" you are not adult enough for admission ");
        }


        sc.close();
    }
}
