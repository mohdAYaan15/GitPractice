package forLoop.patternPrinting;
public class alphabetTriangle {
    public static void main(String[] args) {
       for(int i = 1; i <= 6; i++){
        for(char ch = 'A'; ch < 'A' + i; ch++){
            System.out.print(ch);
        }
        System.out.println();
       }
    }
}
