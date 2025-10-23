public class productOf {
    public static int Product_two(int a, int b){
        int product = a*b;
        System.out.println("The Product of a & b is : " + product);
         return product;

    }
    public static void main(String[] args) {
        // int a =3;
        // int b= 5;
       Product_two(3,5);
       Product_two(13,25);
       Product_two(43,5);
       Product_two(32,5);
        // System.out.println(product);
    }
}