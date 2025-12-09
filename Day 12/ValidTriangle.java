public class ValidTriangle {
    public static void main(String[] args) {
        int a =10;
        int b =12;
        int c = 13 ;
        if((a+b >c) && (a+c >b) && (b+c >a)){
            System.out.println("It is a Valid Triangle");
        }else{
             System.out.println("It is a In Valid Triangle");
        }

    }
    
}
