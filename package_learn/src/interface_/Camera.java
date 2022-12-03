package interface_;

public class Camera implements Usb_interface{
    @Override
    public void start(){
        System.out.println("相机开始工作");
    }
    @Override
    public void stop(){
        System.out.println("相机停止工作");
    }
}