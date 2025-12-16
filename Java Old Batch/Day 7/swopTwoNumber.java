public class swopTwoNumber {
    public static void main(String args[]){
        int temp;
        int a =10;
        int b = 20;
        
            temp = a;
            a=b;
            b = temp;
        
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
