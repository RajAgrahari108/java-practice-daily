public class ArmstrongNumber {
    public static void main(String args[]){
        int n = 407;
        if(isArmstring(n)){
            System.out.println("Amstring  number " );
        }else{
            System.out.println("not a Amrstrong number");
        }
    }

    public static boolean isArmstring(int n){
        int sum = 0, original = n;

        while(n>0){
            int digit = n%10;
            sum = sum + digit *  digit* digit;
            n = n/10;
        }
        return sum== original;
    }
}
