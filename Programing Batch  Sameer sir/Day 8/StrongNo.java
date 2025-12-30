public class StrongNo {
    public static void main(String[] args) {
        int n = 145;
         System.out.println(isStrong(n));
    }

    public static boolean isStrong(int n){
        int sum =0 , original  = n;
        while(n>0){
            int digit = n%10;
             sum = sum+factorial(digit);
            n= n/10;

        } 
        return sum == original;
    }

    public static int factorial(int n){
        int fact =1;
        for(int i=2; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
}
