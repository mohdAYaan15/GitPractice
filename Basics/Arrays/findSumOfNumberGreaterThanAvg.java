package Arrays;

public class findSumOfNumberGreaterThanAvg {

    public static int  findSumAvg(int[] arr){

        //declaring variables 
        int sumOfArray = 0;
        int sumOfNumbers = 0;
    
        //find sum of whole array elements
        for(int i =0; i < arr.length ; i++ ){
            sumOfArray = sumOfArray + arr[i];
        }

        //find avg of array
        double avg = (double)sumOfArray/arr.length;
    
        //calculating sum Of Numbers greater than avg
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > avg){
                sumOfNumbers = sumOfNumbers + arr[i];
            }
        }
        return sumOfNumbers;
    }
    public static void main(String[] args){
        int[] arr = {8, 3, 12, 5, 15, 7, 20, 2, 11};

        //call the method & print the sum of number greater than avg of array 
        System.out.println(findSumAvg(arr));
    }
}
