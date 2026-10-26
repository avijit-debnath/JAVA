public class MaxSubArray_PrefixSum {
    public static void  MsubArray(int numbers[]) {
        int curSum;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length]; 
        
        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++ ){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for (int i =0; i <numbers.length ; i++) {
            int start =i;
            for(int j=i+1; j<numbers.length; j++){
                int end =j;
                curSum= start==0 ? prefix[end]:prefix[end]+prefix[start-1];
                if(maxSum < curSum){
                    maxSum= curSum;
                }
            }
        }
        System.out.println("max sub-array:"+maxSum);
    }

    public static void main(String[] args) {
        int numbers[] ={2,4,6,8};
        MsubArray(numbers);
    }
}

