import java.util.Scanner;
public class sumOfFirstNum {
    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        // int num = 15;
        int sum = 0;
        for(int i = 0; i<=num; i++){
            sum  = sum +i;
        }
        System.out.println(sum);
    }
}
