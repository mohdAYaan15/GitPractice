package ifelseStatement;
import java.util.Scanner;

public class marksGrades {
public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    int marks;
    System.out.println("Enter your marks : ");
    marks = sc.nextInt();

    if( marks >= 90){
        System.out.println("Your grade is A+");
    }else{
        System.out.println("you are not first class student ! ");
    }
    sc.close();
   }

}
