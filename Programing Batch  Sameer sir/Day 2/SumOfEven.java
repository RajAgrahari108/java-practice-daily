public class SumOfEven {
    public static void main(String args[]){
        int n=10;
        isSumOfEven(n);
    }
    static void isSumOfEven(int a){
        int sum =0;
        for(int i=1; i<=a; i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
