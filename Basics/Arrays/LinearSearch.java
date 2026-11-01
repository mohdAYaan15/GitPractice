package Arrays;

public class LinearSearch {

    public static int SearchKey(int numbers[] , int key){
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
     int numbers[] = {2, 3, 4, 8, 10, 12, 14, 16, 18, 20};
     int key = 16;

     int index = SearchKey(numbers, key);
     if(index == -1){
        System.out.println("NOT FOUND");
     }
     else{
        System.out.println("the key has found at index : " + index);
     }
   }

}
