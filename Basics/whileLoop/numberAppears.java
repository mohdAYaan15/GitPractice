public class numberAppears {
    public static void main(String[] args) {
       int num = 545534;
       int i = num;
       int lastDigit;
       int count = 0;

       while(i > 0){
         lastDigit = i % 10;
          i = i / 10;
          if(lastDigit == 5){
            count ++;
          }
       }
       System.out.print(count);
    }
}
