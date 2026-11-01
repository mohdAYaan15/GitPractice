package Arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 56, 99};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of Array is : " + sum);
    }
}
