
class first{
   
    public static void swap(int a,int b) {
        int temp;
        temp=a;
        a=b;
        b=temp;  
    }
    public static int multiply(int a, int b){
        int mul = a * b ;
        return mul;
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact ;
    }
    public static int BinoCoeff(int n, int r, int nMr) {
        int bino ;
        bino = n / (r* nMr);
        return bino;
    }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the N value :");
    // int n = sc.nextInt();
    // System.out.println("Enter the R value :");
    // int r = sc.nextInt();
    // int x =factorial(n);
    // int y =factorial(r);
    // int z =factorial(n-r);
    // int res = BinoCoeff(x, y, z);
    // System.out.println("Binomial Coefficient value is "+ res);
    // }
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for( int i=2; i<n; i++){
            if(i%2==0)
            isPrime = false;
            break;
        }
        return isPrime;
    }
    // public static void main(String[] args) {
    //     boolean fun = isPrime(4);
    //     if ( fun == true ){
    //         System.out.println("the no is  prime");
    //     }
    //     else{
    //         System.out.println("the no. is not prime");
    //     }
    // }
     public static void binTOdec(int binNum){
        int num = binNum;
        int pow = 0;
        int decNum =0;
        while(binNum > 0){
            int lastDigit = binNum % 10 ;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow ++;
            binNum = binNum/ 10;
        }
        System.out.println ("decimal of "+ num + " = "+ decNum);
    
    } 
    public static void decToBin(int n){
        int myNum = n ;
        int pow =0 ;
        int binNum = 0;     
        while( n>0){
            int rem = n % 2 ;
            binNum = binNum + (rem* (int) Math.pow(10, pow)); 
            pow++;
            n = n/2 ;
        }
        System.err.println("Binary form of "+ myNum + " is "+ binNum);
    }


    public static void main(String[] args) {
       //inverted_pyramid(5);
       //floyds_tringle(5);
    }
}
    


