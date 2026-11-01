package Arrays;

public class findSecondLargestSmallerThanAvg {

    public static void findSecondLargest(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        
        double avg = (double)sum / arr.length;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < avg && arr[i] % 2 == 0){
                if(arr[i] > largest){
                    secondLargest = largest;
                    largest = arr[i];
                }
                else{
                    if(arr[i] > secondLargest){
                        secondLargest = arr[i];
                    }
                }
            }
        }
        System.out.println("second largest number < Avg is : " + secondLargest);
    }
    public static void main(String[] args){
        int[] arr = {4, 11, 8, 15, 6, 20, 9, 14, 3, 18};

        findSecondLargest(arr);
    }
}
