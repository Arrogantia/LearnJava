import java.util.*;
public class ComplexTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex data1 = new Complex(a,b);
        Complex data2 = new Complex(c,d);
        Complex add_result = data1.add(data2);
        Complex sub_result = data1.substract(data2);
        Complex mul_result = data1.multiply(data2);
        Complex div_result= data1.divide(data2);
        System.out.println(String.format("Real:%.2f imaginary:%.2f Fabs:%.2f",data1.getReal(),data1.getImage(),data1.calAbs()));
        System.out.println(String.format("Real:%.2f imaginary:%.2f Fabs:%.2f",data2.getReal(),data2.getImage(),data2.calAbs()));
        add_result.print();
        sub_result.print();
        mul_result.print();
        div_result.print();
    }
}
class Complex{
    double real;
    double image;
    Complex(double real){
        this.real = real;
        this.image = 0;
    }
    Complex(){
        this.real = 0;
        this.image = 0;
    }
    public Complex(double real,double image){
        this.real = real;
        this.image = image;
    }
    public double getReal(){
        return real;
    }
    public double getImage(){
        return image;
    }
    public void setReal(double real){
        this.real = real;
    }
    public void setImage(double image){
        this.image = image;
    }
    Complex add(Complex a){
        double real_a = a.getReal();
        double image_a = a.getImage();
        double results_real = real+real_a;
        double results_image = image_a+image;
        Complex result = new Complex(results_real,results_image);
        return result;
    }
    Complex substract(Complex a){
        double real_a = a.getReal();
        double image_a = a.getImage();
        double results_real = real-real_a;
        double results_image = image-image_a;
        Complex result = new Complex(results_real,results_image);
        return result;
    }
    Complex multiply(Complex a){
        double real_a = a.getReal();
        double image_a = a.getImage();
        double results_real = real*real_a-image_a*image;
        double results_image = real*image_a+image*real_a;
        Complex result = new Complex(results_real,results_image);
        return result;
    }
    Complex divide(Complex a){
        double real_a = a.getReal();
        double image_a = a.getImage();
        double results_real = (real*real_a+image*image_a)/(real_a*real_a+image_a*image_a);
        double results_image = (image*real_a-real*image_a)/(real_a*real_a+image_a*image_a);
        Complex result = new Complex(results_real,results_image);
        return result;
    }
    double calAbs(){
        double result = Math.sqrt(real*real+image*image);
        return result;
    }
    void print(){
            if(real>0 && real<0.01){
                if (image>=0 && image <0.01){
                    System.out.println("0.00");
                }
                else {
                    System.out.println(String.format("%.2f",image));
                }
            }
            else {
                if (image >=0 && image<0.01){
                    System.out.println(String.format("%.2f",real));
                }
                else{
                    if (image > 0) {
                        System.out.println(String.format("%.2f+%.2fi", real, image));
                    }
                    else if (image < 0){
                        System.out.println(String.format("%.2f%.2fi",real,image));
                    }
                    else {
                        System.out.println(real);
                    }
                }
            }
    }
}

