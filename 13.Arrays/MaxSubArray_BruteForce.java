public class MaxSubArray_BruteForce {
    public static void  MsubArray(int numbers[]) {
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;
         
        for (int i =0; i <numbers.length ; i++) {
            int start =i;
            for(int j=i+1; j<numbers.length; j++){
                int end =j;
                curSum=0;
                for(int k=start;k<=end;k++){
                    //subarray sum
                    curSum += numbers[k];
                }
                System.out.println(curSum);
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
