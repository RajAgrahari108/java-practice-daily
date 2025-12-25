

public class SumOfSpyNo {
    public static void main(String[] args) {
        int num = 1200;

        for (int i = 1; i <= num; i++) {
            if (isSpy(i)) {
                System.out.println(i);
            }
        }
        

    }
    public static boolean isSpy(int num){
        int sum =0, prod = 1;
        while(num>0){
            int temp = num%10;
            sum = sum + temp;
            prod = prod * temp;
            num = num /10;
        }
        return sum == prod;
    }
}
