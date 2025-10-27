public class array {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
         int c[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
