

public class incDecOperator {
    public static void main(String[] args) {
       
        // increment operator 
        
         int a = 5;

        System.out.println("Value of a before Increment : " + a); // 5
        a++; // post increment  5 -> 6
        System.out.println("value of a after  post increment : " + a); // 6
        ++a; // pre Increment  6 -> 7
        System.out.println("value of a after pre increment : " + a); // 7 
    
        //decrement operator

        int b = 6;
        
        System.out.println("value of b before decrement : " + b); // 6
        b--; // post decrement 6 -> 5
        System.out.println("value of b after post decrement : " + b); // 5
        --b; // pre decrement 5 -> 4
        System.out.println("value of b after pre decrement : " + b); // 4

    }
}
