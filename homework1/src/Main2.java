import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        double Pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input figure type!");
        int pic_type = input.nextInt();
        double s;
        //circle
        if (pic_type == 1){
            int r = input.nextInt();
            s = Pi * r * r;
            System.out.printf("%.2f%n",s);
        }
        //rectangle
        else if (pic_type == 2){
            int a = input.nextInt();
            int b = input.nextInt();
            s = a * b;
            System.out.printf("%.2f%n",s);
        }
        //square
        else if (pic_type == 3){
            int l = input.nextInt();
            s = l * l;
            System.out.printf("%.2f%n",s);
        }
        //error
        else{
            System.out.println("Invalid Data!");
        }

    }
}
