public class PrimeNumber {
    public static void main(String[] args) {

        int n = 8;
        boolean res = isPrime(n);

        if (res) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }

    static boolean isPrime(int n) {

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
