
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 407;
        
         if(isArmStrong(n)){
            System.out.println("Amrstring number ");
         }else{
            System.out.println("not a Amrstring number ");
         
         }
    }

    public static boolean isArmStrong(int n){
        int sum = 0, original = n;
        while(n>0){
            int r= n%10;
            n = n/10;
            sum = sum + r*r*r;
        }
        return sum==original;

    }
    
}
