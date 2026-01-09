public class Ninteen {
    
    public static void main(String[] args) {

        int n = 4; // number of rows

        for (int i = 1; i <= n; i++) {

            // 1️⃣ Print spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // 2️⃣ Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 3️⃣ Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // 4️⃣ Move to next line
            System.out.println();
        }
    }
}


