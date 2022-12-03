import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double r = 0;

        point MyPoint = new point();
        System.out.println(String.format("x=%.2f,y=%.2f",MyPoint.getX(),MyPoint.getY()));
        System.out.println(String.format("radius=%.2f",r));
        for (int i = 0; i<n; i++){
            double x = input.nextDouble();
            MyPoint.x = x;
            double y = input.nextDouble();
            MyPoint.y = y;
            r = input.nextDouble();
            //point MyPoint = new point(x,y);
            System.out.println(String.format("x=%.2f,y=%.2f",MyPoint.getX(),MyPoint.getY()));
            System.out.println(String.format("radius=%.2f",r));
        }
    }

}
class point{
    double x;
    double y;
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}