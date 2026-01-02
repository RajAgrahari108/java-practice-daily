
public class FibonacciSerise {
    public static void main(String[] args) {
        int n = 10, fir = 0, sec = 1;
        for(int i=1; i<=n;i++){
           int next = fir +sec;
           fir = sec;
           sec = next;
            System.out.println(fir + " ");
        }
        
    }
}
