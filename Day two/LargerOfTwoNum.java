import java.util.Scanner;
public class LargerOfTwoNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number");

        System.out.print("Enter the first number : ") ;   
        int num1= sc.nextInt();
        
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 >num3){
            System.out.println("num1 is grster then num2 and num3 : " +num1);
        }
        else if(num2 > num3 && num2 > num1){
            System.out.println("num2 is grater then num1 and num3 : " +num2 );
        }else{
            System.out.println("Num3 is grater then num1 and num2 : " + num3);
        }
    }
}
