package forLoop.patternPrinting;
public class starprint {
    public static void main(String[]args){
       for(int row = 1; row <= 5; row++){
        for(int star = 5; star >= row; star--){
            System.out.print(" * ");
        }
       System.out.println();
       }
    }
}
