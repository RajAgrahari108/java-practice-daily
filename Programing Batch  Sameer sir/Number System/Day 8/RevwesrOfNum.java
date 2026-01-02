public class RevwesrOfNum {
    public static void main(String[] args) {
        int n=123;

      System.out.println("Reversed Number is: "
                         + isRev(n));
       
    }

    public static int isRev(int n){
        int rev = 0;
        while(n>0){
            int digit  = n%10;
            rev = rev*10 + digit;
            n=n/10;
        }
        return rev;
    }
}
