package Arrays;

public class ElementGreaterThanFive {
    public static void main(String[] args) {
        int [] arr = {4, 6, 7, 2, 3, 9, 12, 15};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 5){
                System.out.println(arr[i]);
            }
        }
    }
}