/**
 * Created by bhawnasingla on 07/02/16.
 */
public class HorizontalLine {

    public static void main(String[] args) {
        int n = 8;
        printLine(n);
    }

    private static void printLine(int n) {
        for(int i = 0; i<n; i++)
            System.out.print("*");

    }
}
