package TypeCasting;

public class testCasting {
    public static void main(String[] args) {
        double price = 499.99d;
         short new_price  = (short)price;

        System.out.println("before Type Casting , price is : " + price );
        System.out.println("after Type Casting , price is : " + new_price );
    }
}
