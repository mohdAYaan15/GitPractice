package Arrays.Searching;

class findSmallestEvenGreaterThanAvg {
    public static void main(String[] args) {
       
       int[] arr = {8, 15, 22, 7, 30, 18, 11, 24, 6, 19, 28};
       int sum = 0;

        for(int i = 0; i < arr.length; i++){
         sum = sum + arr[i];
        }

        double avg = (double)sum/ arr.length;

        int smallest = Integer.MAX_VALUE;
        int smallestIndex = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] > avg){
                if(arr[i] < smallest){
                    smallest = arr[i];
                    smallestIndex = i;
                }
            }
        }

        System.out.println("smallest even greater than avg is  : " + smallest);
        System.out.println("Index of smallest is : " + smallestIndex);
    }
    
}