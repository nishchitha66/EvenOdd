import java.util.*;
class Employee{
    String name;
    int age;
    String role;
    Employee(String name, int age, String role){
        this.name=name;
        this.age=age;
        this.role=role;
    }
    void display(){
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Role:" +role);
    }
    public static void main(String[]args){
        Employee s1=new Employee("Ravi",24,"Developer");
        Employee s2=new Employee("Ram",26,"Tester");
        s1.display();
        s2.display();
    }
}