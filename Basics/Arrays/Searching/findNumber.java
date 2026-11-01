package Arrays.Searching;

public class findNumber {
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 20, 3, 15};

        int target = 3;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("the targeted number is at index : " + i);
            }
        }
    }
}
