package doWhile;

public class printTable {
    public static void main(String[] args) {
        int num = 6;
        int i = 1;
        do{
            System.out.println(num * i);
            i++;
        }
        while(i <= 10);
    }
}