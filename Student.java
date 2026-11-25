import java.util.*;
class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
    }
    public static void main(String[]args){
        Student s1=new Student("John",18);
        Student s2=new Student("Mary",19);
        s1.display();
        s2.display();
    }
}