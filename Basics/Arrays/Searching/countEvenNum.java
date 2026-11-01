package Arrays.Searching;

public class countEvenNum {
    public static void main(String[] args) {

        int[] arr = {5, 12, 7, 12, 3, 18, 12, 9, 20, 12};
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count ++;
            }
        }
        System.out.println(count);

    }
}
