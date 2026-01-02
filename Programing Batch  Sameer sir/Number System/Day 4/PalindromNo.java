
public class PalindromNo {
    public static void main(String[] args) {
        int n =221;
        boolean res = isPlalin(n);

        if(res){
            System.out.println("Palindeom");
        }
        else{
        System.out.println("not a palindeom");
        }
    }

    static boolean isPlalin(int n){
        int rev = 0; int originalNo = n;
        while(n>0){
            rev= (rev*10) + n%10;
            n= n/10;
        }
        return rev == originalNo;
    }
}
