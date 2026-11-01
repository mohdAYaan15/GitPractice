package Arrays.Searching;

public class findTheLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {7, 4, 12, 9, 4, 15, 4, 20};

        int target = 4;
        int lastIndex = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == target){
                lastIndex = i;
            }
        }
        System.out.println(lastIndex);
    }
}
