package pattern;

// *****
// *****
// *****
// *****

public class printPattern {
    public static void main(String args[]) {
        int n = 4, m = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
