public class maximOfArray {
    public static void main(String[] args) {
        int a[]= {10, 20, 58, 30, 65};
        int num = a[0];
        for(int i=0; i<a.length; i++){
            
                if( num < a[i]){
                    num = a[i];
                }
            
        }
        System.out.println(num);
    }
}
