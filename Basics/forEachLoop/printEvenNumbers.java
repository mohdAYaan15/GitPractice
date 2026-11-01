public class printEvenNumbers {
    public static void main(String[] args) {
       int[] integer = { 10, 23, 24, 56, 39};

        for(int number : integer){
            if(number % 2 == 0){
                System.out.println(number);
            }    
        }
    }
}
