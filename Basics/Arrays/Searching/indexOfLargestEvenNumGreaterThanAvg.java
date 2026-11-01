package Arrays.Searching;

public class indexOfLargestEvenNumGreaterThanAvg {
    public static void main(String[] args) {
        int[]arr = {5, 18, 7, 24, 12, 9, 30, 16, 3, 22};

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        double avg = (double)sum/arr.length;
        int largest = Integer.MIN_VALUE;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if((arr[i] % 2 == 0 && arr[i] > avg) && arr[i] > largest){
                largest = arr[i];
                index = i;
            }
        }
        System.out.println("the largest even number is : " + largest);
        System.out.println("the index is : " + index);

    }
}
