import java.util.*;
public class ProductOfTwoNumbers {

    public static int calculateProduct(int a, int b) {
        // int prod = a * b;
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = calculateProduct(a, b);
        System.out.println("the product of thyw nunmbers is : " + prod);
    }
}
