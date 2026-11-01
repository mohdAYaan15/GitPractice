package Arrays;

public class subArraysSumMaxMin {

    public static void main(String[] args) {
       int arr [] = { 2, 3, 5, 6};
        int sum  = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];

                    if(sum > maxSum){
                        maxSum = sum;
                    }
                    if(sum < minSum){
                        minSum = sum;
                    }
                }
                System.out.println();
                System.out.println("the sum of subArray is : " + sum);
                System.out.println();
                sum = 0;
                
            }
             System.out.println();
        }
        System.out.println("the minSum of SubArray is : " + minSum);
         System.out.println("the maxSum of SubArray is : " + maxSum);
        
    }

}
