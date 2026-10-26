public class pow {
    public static int power(int x, int n){
        if(n == 0){
           return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x*xnm1;
        return xn;

        //return x* power(x, n-1);
    }
    public static void main(String[] args) {
        int n = 8;
        int x = 2;
        System.out.println(power(x, n));
    }
}
