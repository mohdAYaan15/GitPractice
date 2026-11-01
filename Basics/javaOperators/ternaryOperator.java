

public class ternaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5, max;
        max = (a > b) ? (a > c ? a : c) : (b > c ?  b : c );
        System.out.println("the maximum of a, b and c is: " + max);
        
        
    }
}
