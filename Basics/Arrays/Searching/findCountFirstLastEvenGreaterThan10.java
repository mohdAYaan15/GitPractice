package Arrays.Searching;

public class findCountFirstLastEvenGreaterThan10 {
    public static void main(String[] args) {
        int[] arr = {5, 14, 7, 22, 14, 9, 18, 14, 3, 26, 11, 14, 8};
        
        int firstIndex = -1;
        int lastIndex = -1;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] > 10){
                if(firstIndex == -1){
                    firstIndex = i;
                }
                lastIndex = i;
                count++;
            }
        }
        System.out.println("count : " + count);
        System.out.println("FirstIndex : " + firstIndex);
        System.out.println("lastIndex : " + lastIndex);
    }
}
