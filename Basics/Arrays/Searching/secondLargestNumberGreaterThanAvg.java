package Arrays.Searching;

public class secondLargestNumberGreaterThanAvg {
    public static void main(String[] args) {

        int[] arr = {12, 5, 18, 7, 24, 12, 9, 30, 16, 3, 22, 18};
        int sum = 0;

        //calculate  sum 
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        //calculate avg
        double avg = (double)sum/arr.length;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int largestIndex = -1;
        int secondLargestIndex = -1;

        //finding largest and secondLargest
        for(int i = 0; i < arr.length; i++){

            //check even & greater than avg
            if(arr[i] % 2 == 0 && arr[i] > avg){
                if(arr[i] > largest){

                    // updating secondLargest & its index
                    secondLargest = largest;
                    secondLargestIndex = largestIndex;

                    //updating largest & its index 
                    largest = arr[i];
                    largestIndex = i;
                }
                else if( arr[i] > secondLargest){
                    secondLargest = arr[i];
                    secondLargestIndex = i;
                }
            }
        }

        System.out.println(secondLargest);
        System.out.println(secondLargestIndex);
    }
}
