public class ReverseOfANumber {
    public static void main(String args[]){
        int rev = 0;
        int num  = 1234;
        while(num > 0) {
            int digit = num % 10;       // last digit nikalo
            rev = rev * 10 + digit;     // digit ko reverse me jodo
            num = num / 10;             // number ko chhota karo
        }
        System.out.println(rev);
    }
}
