import java.util.*;
public class TestPoint{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i<n; i++){
            double x = input.nextDouble();
            double y = input.nextDouble();
            point MyPoint = new point(x,y);
            System.out.println(MyPoint.getX());
            System.out.println(MyPoint.getY());
        }
    }

}
class point{
    private double x;
    private double y;
    public point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}