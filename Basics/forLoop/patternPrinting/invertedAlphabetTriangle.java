package forLoop.patternPrinting;;
public class invertedAlphabetTriangle {
    public static void main(String[] args) {
        for(int i = 7; i >= 1; i--){
            for(char ch = 'A'; ch < 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
