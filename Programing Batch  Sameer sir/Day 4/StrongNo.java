
public class StrongNo {
    static boolean isStrongNo(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + fact(digit);
            n = n / 10;
        }

        return sum == original;
    }

    static int fact(int n){
        int fact = 1;
        for(int i=0; i<=n; i++){
            fact = fact+i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n  =5;
       boolean res =  isStrongNo(n);
       if(res){
        System.out.println("Strong no");
       }else{
        System.out.println("not a Strong no");
       }
    }
}
