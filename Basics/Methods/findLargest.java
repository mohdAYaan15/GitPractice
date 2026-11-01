import java.util.Scanner;

public class findLargest {
    
    static void findlargest(){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number :  ");
        int a = sc.nextInt();

        System.out.print("enter Second number :  ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println(a + " largest");
        }
        else if( b > a){
            System.out.println( b + " is largest .");
        }
        else{
            System.out.println("both numbers are same .");
        }
        
        sc.close();
    }

    static void evenOdd(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println( num + " is a Even number . ");
        }
        else{
            System.out.println(num + " is a odd Number ");
        }
        sc.close();
    }

    static void Grade(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        if(marks >= 90 && marks <= 100){
            System.out.println("GRADE : A ");
        }
        else if(marks >= 80){
            System.out.println("GRADE : B");
        }
         else if(marks >= 60){
            System.out.println("you just pass !");
        }
         else if(marks <= 50){
            System.out.println("Sorry to say you are fail ! ");
        }
        else{
            System.out.println("Invalid marks");
        }
        sc.close();
    }
    public static void main(String[] args) {
      findlargest();
      evenOdd();
      Grade();

    }
}
