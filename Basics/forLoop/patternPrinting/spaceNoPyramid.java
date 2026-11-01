package forLoop.patternPrinting;
public class spaceNoPyramid {
    public static void main(String[] args) {
       for(int i = 1; i<=7; i++){
        //Space 
        for(int j = 1; j <=(7 - i); j++){
            System.out.print(" ");
        }
        // number 
        for(int n = 1; n <= i; n++){
            System.out.print(n + " ");
        }
        System.out.println();
       }
    }
}
