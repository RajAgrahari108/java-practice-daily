public class Fibinacci {
    public static void main(String[] args) {
        int n = 10;
        isFibinacci(n);
    }

    public static void isFibinacci(int n){
        int num1 = 0, num2=1, num3;
        System.out.println(num1 +" "+num2 + " ");
        for(int i=1; i<=n-2; i++){
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
        
    }
}
