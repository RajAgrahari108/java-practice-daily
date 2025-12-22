
public class ReverseANum {
    

        public static int isRev(int n){
            int rev = 0; 
            while(n>0){
                rev = (rev*10) + n%10;
                n = n/10;
            }
                return rev;
        }
        
    public static void main(String[] args) {
        int n = 1234;
        int res = isRev(n);
        System.out.println("The reverse of anumber is "+res);
    }
}
