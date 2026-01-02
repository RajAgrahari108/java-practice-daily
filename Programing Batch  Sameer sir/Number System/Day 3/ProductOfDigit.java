
public class ProductOfDigit {
         public static void main(String[] args) {
        int n = 234;
        int res = isCountDigit(n);
        System.out.println("the product of the given number is "+res);

    }

    static int isCountDigit(int n){
        int count = 1;
        while(n>0){
            int temp = n%10;
            count = count*temp;
            n = n/10;
        }
        return count;
    } 
}
