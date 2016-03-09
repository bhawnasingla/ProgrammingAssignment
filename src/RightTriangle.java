/**
 * Created by bhawnasingla on 07/02/16.
 */
public class RightTriangle {
    public static void main(String[] args) {
        int n = 4;
        PrintTriangle(n);
    }

    private static void PrintTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
