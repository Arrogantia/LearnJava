import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Please input n!");
        int n = input.nextInt();
        while(n>0){
            n=n-1;
            int i = input.nextInt();
            if (i % 2 == 0){
                System.out.println("0");
            }
            else{
                System.out.println("1");
            }
        }
    }
}