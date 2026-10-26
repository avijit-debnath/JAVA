class solution {
    public static int floorSqrt(int n) {
        int low=0;
        int high = n;
        int ans =0;
        while ( low <= high){
            int mid = low + (high - low) /2;
            if(mid*mid <= n){
                ans = (int) mid;
                low = (int) mid + 1;
            }
            else {
                high = (int) mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        solution s= new solution();
        int num = 36;
        System.out.println(s.floorSqrt(25));
    }
}