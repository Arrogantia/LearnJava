import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Complex complex = getComlex();

    }
    public static void Complex() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(times(x,y));

    }
    public static int add(double x1,double y1,double x2,double y2){
        double results;
        results = x1 + x2;
        return results;
    }
    public static double substract(double x1,double y1,double x2,double y2){
        double results;
        results = x * y;
        return results;
    }
    public static double multiply(double x1,double y1,double x2,double y2){
        double results;
        results = x * y;
        return results;
    }
    public static double divide(double x1,double y1,double x2,double y2){
        double results;
        results = x * y;
        return results;
    }
    public static double calAbs(double x1,double y1,double x2,double y2){
        double results;
        results = x * y;
        return results;
    }

}
@Data
class Complex{
    double Real;
    double Imaginary;
}
