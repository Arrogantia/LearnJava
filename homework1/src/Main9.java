public class Main9 {
    public static void main(String[] args) {
        int pic_type = 0;
        for(int i = 32;i<100;i++){
            int n = i * i;
            if (n/1000 == n/100%10){
                if(n/10%10==n%10){
                    System.out.println(n);
                }
            }
        }
    }
}
