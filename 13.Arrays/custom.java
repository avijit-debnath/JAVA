import java.util.*;
class student{
    int id;
    String name;
    int age;
    float height;
    public void details(){
        System.out.println("the student id is "+id);
        System.out.println("the student name is "+name);
        System.out.println("the student age is "+age);
        System.out.println("the student height is "+height);
    }
}

public class custom {
    public static void main(String[] args) {
        student s1= new student();
        student s2=new student();
        
        Scanner sc= new Scanner(System.in);
        
        s1.name= sc.nextLine();
        s1.id= sc.nextInt();
        s1.age= sc.nextInt();
        s1.height= sc.nextFloat();
        s1.details();
        sc.nextLine();
        
        System.out.println("Student 2 is");
        s2.name= sc.nextLine();
        s2.id= sc.nextInt();
        s2.age= sc.nextInt();
        s2.height= sc.nextFloat();
        s2.details();
    
        sc.close();
        
    }
}
