
public class diamondPattern{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i <= 5; i++){

            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //lower half 

        for(int i = 1; i <= 4; i++){

            for(int j = i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = 7;j >= 2*i-1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}