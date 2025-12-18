

public class SumOfDigit {
    public static void main(String[] args) {
        int n =123;
        int res=isSumOfNum(n);
        System.out.println(res);
    }
    static int isSumOfNum(int n){
        int sum = 0;
        while(n>0){
            int temp = n%10;
            n = n/10;
            sum = sum + temp;
        }
        return sum;

    } 
}
