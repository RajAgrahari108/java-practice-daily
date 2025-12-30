public class FactorialOfANum {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isFactorial(n));
    }
    public static int isFactorial(int n){
        int fact = 1;
        for(int i=1; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    }
} 
