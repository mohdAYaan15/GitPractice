package Arrays;

public class findLargestEvenNumGreaterThanAvg {

    public  static void findLargestOfAvg(int[] arr){

        //declaring variables
        int sum = 0;

        //calculating sum of array
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        //declaring and initializing variables
        int avg = sum / arr.length;
        int largestEvenNum = Integer.MIN_VALUE;

        // loop for find the largest Even Number
        for(int i = 0; i < arr.length; i++){
            if((arr[i] > avg && arr[i] % 2 == 0) && arr[i] > largestEvenNum){
                largestEvenNum = arr[i];
            }
        }

        //check if Largest Even Num is greater than the avg of array  ?
        if(largestEvenNum > avg){
            System.out.println(largestEvenNum);
        }
    }
    public static void main(String[] args){
        int[] arr =  {4, 9, 2, 15, 7, 12, 3, 20};

        //call the method 
        findLargestOfAvg(arr);
    }
}
