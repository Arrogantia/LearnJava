import java.io.PrintStream;
import java.security.Principal;

public class encaplearning {
    public static void main(String[] args){
        Person My_person = new Person();
        My_person.setName("jack ");
        My_person.setAge(311);
        My_person.setSalary(5000);
        System.out.println(My_person.info());
        
    }

}
class Person{
    public String name;
    private int age;
    private double salary;
    public void setName(String name){
        this.name = name;
    }
    //快捷键 alt+insert
    public Person(){
    }
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary );
    }

    public void setAge(int age) {
        //判断
        if(age>=1 && age<100){
            this.age = age;

        }
        else {
            System.out.println("age warning");
            this.age = 0;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //get return results
    public String info(){
        return name + age + " salary = " + salary;
    }

}
