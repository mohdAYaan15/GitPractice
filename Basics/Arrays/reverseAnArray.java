package Arrays;

public class reverseAnArray {
    public static void reverse(int [] numbers){
       int firstIndex = 0;
       int lastIndex  = numbers.length - 1 ;

       while( firstIndex < lastIndex){
         int temp = numbers[firstIndex];
         numbers[firstIndex] = numbers[lastIndex];
         numbers[lastIndex] = temp;

         firstIndex++;
         lastIndex--;
       }
    }

    public static void main(String[] args){

        int[] numbers = { 12, 34, 21, 45, 65 ,78, 90};
        reverse(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
