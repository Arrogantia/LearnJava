public class Main {
    public static void main(String[] args) {
        Computer My_computer = new Computer();
        My_computer.run();
        My_computer.stop();
    }
}
class Computer{
    private Cpu cpu;
    private Ram ram;
    private Cdrom cdrom;
    Computer(){
        this.cpu = new Cpu();
        this.ram = new Ram();
        this.cdrom = new Cdrom();
        System.out.println("Constructing a COMPUTER");
    }
    void run(){
        System.out.println("COMPUTER is running");
        this.cpu.run();
        this.ram.run();
        this.cdrom.run();
    }
    void stop(){
        this.cdrom.stop();
        this.ram.stop();
        this.cpu.stop();
        System.out.println("COMPUTER is stopping");
    }
}
class Cpu{
    Cpu(){
        System.out.println("Constructing a CPU");
    }
    void run(){
        System.out.println("CPU is running");
    }
    void stop(){
        System.out.println("CPU is stopping");
    }
}
class Ram{
    Ram(){
        System.out.println("Constructing a RAM");
    }
    void run(){
        System.out.println("RAM is running");
    }
    void stop(){
        System.out.println("RAM is stopping");
    }
}
class Cdrom{
    Cdrom(){
        System.out.println("Constructing a CDROM");
    }
    void run(){
        System.out.println("CDROM is running");
    }
    void stop(){
        System.out.println("CDROM is stopping");
    }
}