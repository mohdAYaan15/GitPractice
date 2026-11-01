package forLoop.patternPrinting;
public class numberPyramid {
    public static void main(String[] args) {
        int space = 5;

        for(int i = 1; i <= 5; i++){

            // space
            for(int j = 1; j <= space - i; j++){
                System.out.print(" ");
            }

            // number
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
            
        }
    }
}
