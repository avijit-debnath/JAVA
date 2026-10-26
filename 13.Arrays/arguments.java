

public class arguments {
    public static void  update(int marks[],int nonChangable){
        nonChangable = 10;
        for(int i =0; i< marks.length; i++){
            marks[i]= marks[i]+1;
        }
    }
    public static void main (String args[]){
        System.out.println("hello");
        int nonChangable = 5;

        int marks[] = {97,98,99};
        update (marks,nonChangable );
        for(int i =0; i< marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println()  ;
        System.out.println(nonChangable);
    }
}
