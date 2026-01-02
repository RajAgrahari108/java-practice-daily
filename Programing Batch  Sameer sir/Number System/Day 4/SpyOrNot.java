public class SpyOrNot {

    public static boolean isSpy(int n){
        int sum = 0; int prod = 1 ;
        while(n>0){
            int temp = n%10;
            sum = sum+temp;
            prod = prod * temp;
            n = n/10;
        }

        return sum == prod;

    } 
            public static void main(String[] args) {
             int n = 1124;
            boolean res =  isSpy(n);
            if(res){
                System.out.println("no is spy :" + n);
            }else{
                System.out.println("no is not a spy no");
            }

    }
}
