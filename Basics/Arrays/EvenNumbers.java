package Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        int marks[] = { 98, 21 , 34, 74, 78};

        for(int i = 0; i <= marks.length; i++){
            if(marks[i] % 2 == 0){
                System.out.println(marks[i] +"  EVEN");
            }
            else{
                System.out.println(marks[i] +"  ODD");
            }
        }
    }
}
