import java.util.*;
//ArrayList
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Object> My_list = new ArrayList<>();
        double loan = input.nextDouble();
        String date = input.next();
        String Place = input.next();
        String frame = input.next();
        double r = input.nextDouble();

        Loan My_loan = new Loan(loan);
        Date My_date = new Date(date);
        Frame My_frame = new Frame(frame);
        Circle My_r = new Circle(r);

        My_list.add(My_loan);
        My_list.add(My_date);
        My_list.add(Place);
        My_list.add(My_frame);
        My_list.add(My_r);

        for (Object i : My_list) {
            System.out.println(i);
        }
    }
}
class Loan{
    double loan;
    Loan(double loan){
        this.loan = loan;
    }
    public String toString(){
        return String.format("Loan: %.2f",loan);
    }
}
class Date{
    String Date;
    Date(String Date){
        this.Date = Date;
    }
    public String toString(){
        return "Date: "+Date;
    }
}
class Frame{
    String Frame;
    Frame(String Frame){
        this.Frame = Frame;
    }
    public String toString(){
        return "Frame: "+Frame;
    }
}
class Circle{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public String toString(){
        return String.format("Circle: %.2f",radius);
    }
}