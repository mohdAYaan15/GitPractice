package Arrays;

public class findLargestEvenSmallerThanAvg {

    public static void findLargestEven(int [] arr){

        //declare variables 
        int sum = 0;

        //find the sum of the array 
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        //calculate the avg of the array 
        double avg = (double)sum / arr.length;

        int largest = Integer.MIN_VALUE;

        //find the largest Even < avg
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < avg && arr[i] % 2 == 0){
                if(arr[i] > largest){
                    largest = arr[i];
                }
            }
        }
        //prints the largest
        System.out.println("largest Even < avg is : " + largest);
    }
    public static void main(String[] args) {

        //declare an array 
        int[] arr = {7, 12, 5, 20, 8, 15, 3, 18, 10, 25};
        
        //call the method
        findLargestEven(arr);
    }
}
