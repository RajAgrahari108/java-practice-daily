public class SpyOrNot {
    public static boolean isSpyNo(int n){
        int sum = 0, prod = 1;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            prod = prod*digit;
            n = n/10;
        }
        return sum==prod;
    }
    public static void main(String[] args) {
        int n = 1124;
       System.out.println( isSpyNo(n));
    }
}
