/**
 * Created by bhawnasingla on 07/02/16.
 */
public class PrimeFactor {
    public static void main(String[] args) {
        int n = 30;
        generate(n);
    }

    private static void generate(int n) {
        n=FindAllTwo(n);
        n=FindAllPrime(n);
        FindIfItselfPrime(n);
    }

    private static void FindIfItselfPrime(int n) {
        if (n > 2)
            System.out.println(n);
    }

    private static int FindAllPrime(int n) {

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n%i == 0)
            {
                System.out.println(i);
                n = n/i;
            }
        }
        return n;
    }

    private static int FindAllTwo(int n) {
        while (n % 2 == 0) {
            System.out.println("2");
            n = n / 2;
        }
        return n;
    }
}