public class removeDuplicatefromsortedArray {

    public static void main(String[] args) {
        int a[] = {1,2,2,3,4,4,5,6};

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                System.out.println("Duplicate: " + a[i]);
            }
        }
    }
}




