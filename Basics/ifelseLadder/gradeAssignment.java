package ifelseLadder;
import java.util.Scanner;

public class gradeAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks;
        System.out.println("ENter your marks : ");
        marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("GRADE : A");
        }
        else if( marks >= 75){
            System.out.println("GRADE : B");
        }
        else if( marks >= 60){
            System.out.println("GRADE : C");
        }
        else if(marks >= 50){
            System.out.println("GRADE : D");
        }
        else{
            System.out.println("SORRY to say , you are fail  ! ");
        }

        sc.close();
    }
}
