public class fabinochaiSerise {
    public static void main(String args[]){
         int num  = 5; 
         int a = 0;
         int b = 1;
         int next = 0;
        for (int i = 2; i <= num; i++) {
            System.out.print(a + " ");
             next = a + b;
            a = b;
            b = next;
        }
        System.out.println(next);
    }
}
