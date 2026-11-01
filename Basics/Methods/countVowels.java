import java.util.*;

public class countVowels {

    public static int checkVowel(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
           if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'  || str.charAt(i) == 'u' ){
            count ++;
           }
        }
        return count;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String str = sc.nextLine();

        System.out.println("the number of vowel in this string is : "+ checkVowel(str));          

        sc.close();
    }

}
