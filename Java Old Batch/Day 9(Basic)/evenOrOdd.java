public class evenOrOdd {
    public static void main(String args[]){

        // ! using %
        int a = 35;
        if(a%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        // ! cant using mode %
        int n= 34;
        if(n/2 * 2 == n){
          System.out.println("even");
        }else{
            System.out.println("odd");
        }

        // ! using switch statement
        int m = 23;
        switch(m%2){
            case 0:
            System.out.println("even");
            break;

            case 1:
            System.out.println("odd");
            break;
        }

    }
    
}
