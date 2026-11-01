package Arrays;

class findLargestOddIndex {
    public static void main(String[] args) {
        int[] arr = {7, 14, 5, 22, 9, 18, 31, 12, 6, 25};

        int largestOdd = Integer.MIN_VALUE;
        int largestOddIndex = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                if(arr[i] > largestOdd){
                    largestOdd  = arr[i];
                    largestOddIndex = i;
                }
            }
        }
        System.out.println("largestOdd : " + largestOdd);
        System.out.println("largestOddIndex : " + largestOddIndex);

    }
    
}