
import java.util.Scanner;

/* Find the sum of the even values fib terms
 * not exceeding 4 million
 */
public class EvenFibNum {

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter a number between 1 and 4 million: ");
        int n = 50;

        System.out.println("Fib # at n is: " + fib(n));

    }

    public static long fib(long n) {
        long sum = 0;
        long f0 = 0;
        long f1 = 1;
        long f2 = 2;

        if (n == 0) {
            return f0;
        } else if (n == 1) {
            return f1;
        } else if (n == 2) {
            return f2;
        }

        for (int i = 3; i <= n; i++) {

            // swap, add previous two numbers
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
            if (f2 <= 4000000) {
                if ((f2 % 2) == 0) {
                    sum += f2;
                }
            }
        }
        System.out.println(sum + 2);
        return 1;

    }
}
