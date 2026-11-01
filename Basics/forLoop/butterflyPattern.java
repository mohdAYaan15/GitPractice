public class butterflyPattern{
    public static void main(String[] args){
        int n = 5; 

        for(int i = 1; i <= n; i++){
            //first stars 
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            //Spaces 
            for(int j = 8; j >= 2*i-1; j--){
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= 4; i++){
            //first stars 
            for(int j = 4; j >= i ; j--){
                System.out.print("*");
            }
            
            //Spaces 
            for(int j = 0; j <= 2*i-1; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 4; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}