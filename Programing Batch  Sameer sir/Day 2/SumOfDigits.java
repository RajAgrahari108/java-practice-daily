public class SumOfDigits {
    public static void main(String[] args) {
        int n =1234;
        isSumofdigits(n);
    }

    static void isSumofdigits(int a){
       int sum = 0;
       while(a>0){
            int temp = a%10;
            sum = sum + temp;
             a = a /10;
       }
            System.out.println(sum);
    }
}
