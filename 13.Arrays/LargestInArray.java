public class LargestInArray {
    public static int  largest(int numbers[]){
        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE;
        

        for ( int i=1; i<numbers.length; i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest= numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers []= {1,2,5,7,9};
        //System.out.println("largest value is "+ largest(numbers));
        System.out.println("smallest value is "+largest(numbers));
    }
}
