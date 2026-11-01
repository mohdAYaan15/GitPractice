

public class logicalOperator {
    public static void main(String[] args) {
      
        System.out.println("Logical AND Operator ...... ");
        System.out.println((10>1) && ( 10>15)); // false
        System.out.println((10<1) && (5>2)); // false
        System.out.println((10>5) && (5>2)); // true


        System.out.println("Logical OR Operator >>>>>");
        
        System.out.println((20<10) || (10>15)); // false
        System.out.println((10>1) || (5>11)); // true
        System.out.println((10>5) || (5>10)); // true

        System.out.println("Logical NOT Operator >>>>>");

        System.out.println(!(10>1));// false
        System.out.println(!(10<1));// true
    }
}
