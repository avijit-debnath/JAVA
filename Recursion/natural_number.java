public class natural_number {
    public static int sumNatural(int n){
        if(n==1){
            return 1;
        }
        int fnm1 = sumNatural(n-1);
        int sn = n + fnm1;
        return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumNatural(n));
    }
}
