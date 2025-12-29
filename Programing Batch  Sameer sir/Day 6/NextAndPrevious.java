
public class NextAndPrevious {
    public static void main(String[] args) {
        int n = 7;
        int next = getNextPrimeNo(n);
        int prev = getPrevPrimeNo(n);
        isPrime(n);
        if (prev != 0) {
            System.out.println("Previous no " + next);
        } else {
            System.out.println("Next no " + prev);
        }
    }


    public static int getNextPrimeNo(int n){
        if(n<=2){
            return 0;
        }
        n--;
        while(true){
            if(isPrime(n)){
                return n;
            }
            n--;
        }

    }
    public static int getPrevPrimeNo(int n){
        
        n++;
        while(true){
            if(isPrime(n)){
                return n;
            }
            n++;
        }

    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
