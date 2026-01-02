public class PalindromNumber {
    public static void main (String args[]){
        int n= 1221;
       if( isPalindromNum(n)){
        System.out.println("Palindrom number");
       }else{ 
        System.out.println("Not a palindrom number");
       }
    }
    public static boolean isPalindromNum(int n){
        int rev = 0, org = n;

        while(n > 0){
            int digit = n%10;
            rev = (rev*10) + digit;
            n = n/10;
        }

        return rev == org;
    }
}
