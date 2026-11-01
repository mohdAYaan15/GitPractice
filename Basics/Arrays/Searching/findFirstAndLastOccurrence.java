package Arrays.Searching;

public class findFirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {7, 12, 5, 12, 18, 9, 12, 20, 12, 4};
        int target = 12;

        int firstIndex = -1;
        int lastIndex = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target ){
                if(firstIndex == -1){
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }
        System.out.println("first Occurrence at Index : " + firstIndex);
        System.out.println("last Occurrence at Index : " + lastIndex);
    }
}
