import java.util.ArrayList;
import java.util.Collections;

class sortArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(7);
        list.add(12);

        System.out.println(list);
        Collections.sort(list);//ascending
        System.out.println(list);

        //descnding
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);  

    }
}