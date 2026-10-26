import java.util.ArrayList;

public class classroom {
    public static void main(String[] args) {

        ArrayList<Integer> list  = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);// (index, data)

        System.out.println(list);
        
        //Get operator - o (1)
        int element = list.get(2);
        System.out.println(element);

        //Delete 
        list.remove(2); // index no.
        System.out.println(list);

        //set operation
        list.set(2, 10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


        //size function
        System.out.println(list.size());

        //print the arrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //reverse arraylist - O(n)
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
