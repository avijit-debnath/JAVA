public class power {

    public static int optimizedPower(int a, int n) { // O(logn)
        if(n == 0){ 
            return 1;
        }
        int halfpow =optimizedPower(a, n/2 );
        int halfPowSq = halfpow * halfpow;

        // n is odd
        if(n % 2 != 0){
            halfPowSq = a * halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args) {
        int n =7;
        int a =2;
        System.out.println(optimizedPower(a, n));
    }
}
