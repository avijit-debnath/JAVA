


class reverseArray{
    public static  void reversearr(int numbers[]){
        int first = 0, last =numbers.length-1;
        while(first<last){
            int temp =numbers [last];
            numbers[last]= numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        //System.out.println("Hello world");
        int numbers [] = {2,4,6,8,10};
        reversearr(numbers);
        //print array
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

    
}
}
