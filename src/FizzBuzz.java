
public class FizzBuzz {

    private static boolean Fizz(int i) {
        return (i%3==0?true:false);
    }
    private static boolean Buzz(int i) {
        return (i%5==0?true:false);
    }
    private static boolean FizzBuzz(int i) {
        return ((i%3==0&&i%5==0)?true:false);
    }
    public static void main(String[] args) {
        int n=100;
        for(int i=1;i<n;i++)
            if(FizzBuzz(i))                 //or check div by 15
                System.out.println("FizzBuzz");
            else if(Fizz(i))
                System.out.println("Fizz");
            else if(Buzz(i))
                System.out.println("Buzz");
            else
                System.out.println(i);
    }
}
