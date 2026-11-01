package Arrays.Searching;

public class findLargestIndex {
    public static void main(String[] args) {
        int []arr = {15, 7, 22, 9, 31, 18};

        int largest = Integer.MIN_VALUE;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest ){
                largest = arr[i];
                index = i;
            }
        }
        System.out.println("number is : " + largest);
        System.out.println("the index is : " + index);
    }
}
