/**
 * Created by bhawnasingla on 07/02/16.
 */

//2 loops
public class IsoscelesTriangle {
    public static void main(String[] args) {
        int n = 6;
        PrintTriangle(n);
    }

    private static void PrintTriangle(int n) {
        for (int line = 0; line < n; line++) {
            for (int spaces = n; spaces-1 > line; spaces--)
                System.out.print(" ");

            for (int star = 0; star < 2*line+1; star++)
                System.out.print("*");

            System.out.println();
        }
    }
}
