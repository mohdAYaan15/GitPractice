package Arrays.Searching;

public class printDuplicatesNumberIndex {
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 20, 3, 15, 8, 9};
        int target = 8;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("8 at index : " + i);
            }
        }
    }
}
