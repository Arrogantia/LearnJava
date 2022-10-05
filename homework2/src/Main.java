import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(times(x,y));
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println(String.format("%.4f", times(a,b)));
    }
    public static int times(int x,int y){
        int results;
        results = x * y;
        return results;
    }
    public static double times(double x,double y){
        double results;
        results = x * y;
        return results;
    }
}