public class countNoOFDigit {
    public static void main(String args[]){
        int num = 1234;
        int count= 0; 
        if(num ==0){
            count =1;
        }else{
            while(num >0){
            num = num / 10;
            count++;
            }
        }
        
        System.out.println(count);   
    }
}
