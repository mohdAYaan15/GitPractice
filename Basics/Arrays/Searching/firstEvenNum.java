package Arrays.Searching;

public class firstEvenNum{
    public static void main(String[] args) {
    int[] arr = {5, 7, 9, 13, 18, 21, 24};

    int findIndex = -1;

     for(int i = 0; i < arr.length; i++){
        if(arr[i] % 2 == 0){
            findIndex = i;
            break;
        }
     }
     System.out.println(findIndex);
    }
}