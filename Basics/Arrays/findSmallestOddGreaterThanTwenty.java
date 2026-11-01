package Arrays;

public class findSmallestOddGreaterThanTwenty {
    public static void main(String[] args) {
        int[] arr = {10, 17, 24, 7, 32, 15, 28, 19, 6, 21, 30};

        int smallest = Integer.MAX_VALUE;
        int smallestIndex = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] > 20){
                if(arr[i] < smallest){
                    smallest = arr[i];
                    smallestIndex = i;
                }
            }
        }
        System.out.println("Smallest : " + smallest);
        System.out.println("Smallest Index : " + smallestIndex);
    }

}
