import java.util.Scanner;

public class javaBasic {
    public static int printHelloWorld(){
        for (int i=0; i<=5; i++){
                System.out.println("Hello World");
             }
        // System.out.println("Hello World");
        return 0;
    }

    public static int sum( int a,  int b) {
        Scanner sc = new Scanner (System.in);
         a = sc.nextInt();
         b = sc.nextInt();
         int suma = a + b;
         System.out.println("sum is " + suma);
        // int c;
        // c = a+b;
        // System.out.println(c);
        return 1;
         
    }
    
        public static void main(String[] args) {
            // System.out.println("hello world");
            // for (int i=0; i<=5; i++){
            //     System.out.println("printHelloWorld");
            // }
            // printHelloWorld();
            sum();
        }
    }
    

   