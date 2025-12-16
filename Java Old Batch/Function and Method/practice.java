public class practice {
public static void swop(int a, int b){
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
}
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swop(a, b);
    }
}
