public class PrimeNum {

    public static void main(String[] args) {
        int n = 9;

        if (isPrime(n)) {
            System.out.println(n);
            return;
        }

        int next = n + 1, prev = n - 1;

        while (true) {
            if (isPrime(prev)) {
                System.out.println(prev);
                break;
            } else if (isPrime(next)) {
                System.out.println(next);
                break;
            }
            prev--;
            next++;
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
