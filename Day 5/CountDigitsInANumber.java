public class CountDigitsInANumber {
    public static void main(String args[]){
        int n   = 1234;
        int count =0;
        if(n == 0){
            count = 1;
        }else{
            while (n >0) {
           
            n = n /10;
            count ++;
        }
        }
        
        System.out.println(count);
    } 
}
