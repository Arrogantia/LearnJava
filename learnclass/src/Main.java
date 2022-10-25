import java.awt.*;

public class Main {
    public static void main(String[] args) {
       Point Point1 = new Point();
       Point1.x=2;
       Point1.y=4;
       System.out.println(Point1.x+" "+Point1.y);
       //Point Point2 = new Point();
       Point Point2 = Point1;
       System.out.println(Point2.x+" "+Point2.y);
       Point1.x=30;
        System.out.println(Point2.x+" "+Point2.y);
    }
}
class Point{
    double x;
    double y;
}