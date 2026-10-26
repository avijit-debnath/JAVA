
import java.util.Scanner;


public class array {
    
    public static void main(String[] args) {
        // System.out.println("hello");
        // int marks[]=new int [50];
        // int numbers []= {1,2,3};
        // int moreNumbers []= {5,6,7};
        // String fruits [] = {"apple","pineapple","mango"};
        // System.out.println("fruits name is "+ fruits[3]);


        int marks[]= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the mark of Chem -");
        marks[0]=sc.nextInt();
        System.out.println("enter the mark of Phy -");
        marks[1]=sc.nextInt();
        System.out.println("enter the mark of Math -");
        marks[2]=sc.nextInt();
        
        marks[2]=marks[2]+4; //update of marks
        System.out.println("Chem mark "+ marks[0]);
        System.out.println("Phy mark "+ marks[1]);
        System.out.println("Math mark "+ marks[2]);
        System.out.println("length of array is-"+marks.length);
    }
}
