package forLoop.patternPrinting;
public class solidrhombus {
    public static void main(String[] args) {
        int space = 5;
        for(int i = 1; i <= 5; i ++){
            //space
            for(int j = 1; j <= space-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
