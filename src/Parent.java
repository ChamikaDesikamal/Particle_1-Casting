import java.sql.SQLOutput;

public class Parent {
    String name;
    void display(){
        System.out.println("Super Class is running!");
    }
}
class Child extends Parent{
    int age;
    void display(){
        System.out.println("Sub class is running!");
    }
}
class Diwncasting{
    public static void main(String[] args) {
        Parent p = new Child(); //upcasting object
        p.name = "Chamika";
        Child c =(Child) p;
        c.age = 22;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }
}