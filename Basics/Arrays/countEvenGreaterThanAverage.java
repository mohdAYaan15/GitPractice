package Arrays;

public class countEvenGreaterThanAverage {
    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 7, 24, 12, 9, 30, 16, 3, 22, 18};

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        double avg = (double) sum/ arr.length;

        int firstIndex = -1;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] > avg){
                if(firstIndex == -1){
                    firstIndex  = i;
                }
                count++;
            }
        }
        System.out.println("counts are : " + count);
        System.out.println("firstIndex is : " + firstIndex);
    }
}
