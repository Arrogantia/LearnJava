package interface_;
//Phone 类 实现Usb_interface 规定的方法

public class Phone implements Usb_interface{
    @Override
    public void start(){
        System.out.println("手机开始工作");
    }
    @Override
    public void stop(){
        System.out.println("手机停止工作");
    }
}
