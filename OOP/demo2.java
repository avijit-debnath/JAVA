public class demo2 {

    //constructor Overload
    class Student{
        String name;
        int age;
        int rollno;
        String college;

        //defult constructor
        student(){};

        Student(String name){
            this.name =name;
        }

        Student(String name, int age){
            this.name =name;
            this.age=age;
            
        }
        Student(String name, int age, int rollno){
            this.name =name;
            this.age=age;
            this.rollno=rollno;
        }
        Student(String name, int age, int rollno, String college){
            this.name =name;
            this.age=age;
            this.rollno=rollno;
            this.college=college;
        }
        //parameterized constructor
        student(String n, int a, int r, String c){
            name = n;
            age = a;
            rollno = r;
            college = c;
        }
    
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Aditya");
        Student s3 = new Student("Aditya",12);
        Student s4 = new Student("Aditya", 13, 23);
        Student s5 = new Student("Aditya",21, 34, "IITF");

    }
}
