import java.util.*;

public class heap {
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){ //log(n)
            //add at last idx
            arr.add(data);

            int x = (arr.size()-1);
            int par = (x-1)/2;
            
            while(arr.get(x) < arr.get(par)){ //log(n)
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }
        }
        public void pick(int data){
            arr.get(0);
        }
        public void remove (int data){
            int data = arr.get(0);
            //step-1 >> swap first and last
            int temp = arr.get(0);
            arr.set(0,arr.size()-1);
            arr.set(arr.size()-1, temp);

            // step-2 >> delete last
            arr.remove(arr.size()-1);

            //step-3 >> HEAPIFY

        }
        public void heapify(int i){
            int left= 2*i+1;
            int right= 2*i+2;
            int minIdx=i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }
            if(minIdx != i){
                int swap =arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(i,0);
                return data;
            }
        }
    }
    public static void main(String[] args) {
        

    }
}
