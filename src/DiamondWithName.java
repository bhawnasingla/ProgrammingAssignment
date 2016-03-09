/**
 * Created by bhawnasingla on 07/02/16.
 */
public class DiamondWithName {

    static void UpperTriangle(int n){
        for(int line = 0; line<n-1;line++)
        {
            for (int spaces = n; spaces - 1 > line; spaces--)
                System.out.print(" ");

            for (int star = 0; star < 2 * line + 1; star++)
                System.out.print("*");

            System.out.println();
        }
    }

    static void LowerTriangle(int n) {
        for (int line = n; line > 1; line--) {
            for (int spaces = line; spaces <= n; spaces++)
                System.out.print(" ");

            for (int star = 2 * line - 3; star > 0; star--)
                System.out.print("*");

            System.out.println();
        }
    }

    static void MiddleLine(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        int n = 3;
        String name="Bhawna";
        UpperTriangle(n);
        MiddleLine(name);
        LowerTriangle(n);
    }
}
