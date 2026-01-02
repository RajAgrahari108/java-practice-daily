public class SumOfNum {
    public static void main(String[] args) {
        int n=5;
        isSumOfNum(n);
    }
    static void isSumOfNum(int n){
        int sum=0;
        for(int i=1; i<=5; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
