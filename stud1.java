import java.util.*;
class Stud1{
    String name;
    int age;
    void display(){
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
    }
    public static void main(String[]args){
        Stud1 s1=new Stud1();
        Stud1 s2=new Stud1();
        s1.name="John";
        s1.age=18;
        s2.name="Mary";
        s2.age=19;
        s1.display();
        s2.display();
    }
}