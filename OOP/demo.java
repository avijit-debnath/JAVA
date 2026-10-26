public class demo {
    class Student{
        String name; // information/data/characteristics --> instance variables
        int age;
        int rollno;
        String college;
    
        void markAttendence(){ // behaviours --> functions --> instance method
            System.out.println("Attendence marked by " + name);
    
        }
        void print(){
            System.out.println(name+" "+age+ " "+rollno+" " +college);
        }
     
        
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2 = new Student();

        s1.name="Aditya";
        s1.age=29;
        s1.rollno=101;
        s1.college="IIT Guwahati";

        s2.name="akash";
        s2.age=23;
        s2.rollno=111;
        s2.college="IIT Guwahati";

        s1.markAttendence();
        s2.markAttendence();

        s1.print();
        s2.print();
    }
}
}
