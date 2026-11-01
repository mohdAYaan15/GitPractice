package Arrays;

public class findTheSecondLargestNumberGreaterThanAvg {

    public static void FindSecondLargest(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        int avg = sum / arr.length;
        int largest = Integer.MIN_VALUE , secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > avg && arr[i] % 2 == 0){
                
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

        System.out.println("the second largest Number Greater than avg of array is : " + secondLargest);
    }

    public static void main(String[] args){
        int[] arr = {8, 3, 12, 5, 18, 7, 20, 4, 15, 10};

        FindSecondLargest(arr);
    }
}
