
public class CheckTheArryIsShort {
    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a[] = {1, 4,2,3,4, 5};
        if (isSorted(a)) {
            System.out.println("Is Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
