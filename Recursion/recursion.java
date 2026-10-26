
public class recursion {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        //int fnm1 = fact(n-1);
        int fn = n* fact(n-1);
        return fn;

    }



    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }



    public static boolean isSorted(int arr[], int i){
        if ( i == arr.length-1){
            return true;
        }
        if( arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
        //time-complexity : O(n)
        //space-complexity : O(n)
    }



    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){

        }
        if (arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x* xnm1;
        return xn;

        //return x * power(x, n-1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if( i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }



    public static void main(String[] args) {
        //int n = 25;
        int arr [] ={ 1, 2, 3, 4 ,5, 8 ,6 ,7};
        //System.out.println(fact(n));
        //System.out.println(fibonacci(n));
        System.out.println(isSorted(arr, 0));
        System.out.println(lastOccurence(arr, 5, 0));
    }
}


