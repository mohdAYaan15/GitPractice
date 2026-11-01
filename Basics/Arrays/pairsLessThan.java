package Arrays;

public class pairsLessThan {
    
    public static void main(String[] args){
        int [] arr = { 2, 5, 3, 7};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 5){
                for(int j = i + 1; i < arr.length; j++){
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }
    
    }

}