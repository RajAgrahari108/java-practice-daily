
public class FactoeialNo {
    public static void main(String[] args) {
        int n =4;
        System.out.println(isFactoeialNo(n));
    }
    static int isFactoeialNo(int n){
        int fact=1;
        for(int i=2; i<=n ;i++){
            fact = fact*i;
        }
        return fact;
    }
}
