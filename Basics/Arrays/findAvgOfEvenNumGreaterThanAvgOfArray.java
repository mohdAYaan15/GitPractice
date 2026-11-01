package Arrays;

public class findAvgOfEvenNumGreaterThanAvgOfArray {
    public static void findAvgOfEven(int [] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        double avg = (double) sum / arr.length;
        int sumOfEven = 0, count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > avg && arr[i] % 2 == 0){
                sumOfEven = sumOfEven + arr[i];
                count++;
            }
        }
        double avgOfEven = (double)sumOfEven / count;

        System.out.println("avg of even num > avg of array is  : " + avgOfEven);
    }
    public static void main(String[] args){
        int[] arr = {5, 12, 7, 20, 8, 15, 3, 18, 10, 25};
        
        findAvgOfEven(arr);
    }
}
