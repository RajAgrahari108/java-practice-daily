import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a side 1 of triange : ");
        int a  = sc.nextInt();
        System.out.print("Enter a side 2 of triange : ");
        int b  = sc.nextInt();
        System.out.print("Enter a side 3 of triange : ");
        int c  = sc.nextInt();

        if(a==b && b==c && c==a){
            System.out.println("the triangle is Equilateral.");
        }else if(a==b || b==c || a==c){
            System.out.println("the triangle is Isosceles");
        }else{
            ystem.out.println("the triangle is Scalene.");
        }

    }
}
