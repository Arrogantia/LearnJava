package Cat_;

public class Main {
    public static void main(String args[]) {
        Cat[] cat_family = new Cat[3];

        cat_family[0] = new OldCat("HuangLao");
        cat_family[1] = new AdultCat("LaoMei");
        cat_family[2] = new YoungCat("XiaoLi");

        for (int i = 0; i < 3; i++) {
            cat_family[i].show();
            cat_family[i].move();
            cat_family[i].sound();

            System.out.println();
        }
    }
}
abstract class Cat{
    String name;
    public abstract void move();
    public abstract void sound();
    public abstract void show();
}
class AdultCat extends Cat{
    public AdultCat(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("I can move quickly.");
    }
    public void sound(){
        System.out.println("mie mie!");

    }
    public void show(){
        System.out.printf("I am %s,I am a cat!\n",this.name);
    }
}

class OldCat extends Cat{
    public OldCat(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("I move slowly.");
    }
    public void sound(){
        System.out.println("miem miem!");

    }
    public void show(){
        System.out.printf("I am %s,I am a old cat!\n",this.name);
    }
}

class YoungCat extends Cat{
    public YoungCat(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("I like jumping.");
    }
    public void sound(){
        System.out.println("mie mie!");

    }
    public void show(){
        System.out.printf("I am %s,I am a young cat!\n",this.name);
    }
}