package Arrays.Searching;

public class findOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 12, 3, 18, 12, 9};
        
        int target = 12, count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("the occurrence count of 12 is : " + count);
    }
}
