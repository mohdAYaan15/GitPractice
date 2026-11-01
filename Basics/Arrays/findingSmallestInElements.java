package Arrays;

public class findingSmallestInElements {
    public static void main(String[] args) {
        int[] arr = {23, 43, 56, 12, 34, 89};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("the minimum value in  this array is  :  " + min );
    }
}
