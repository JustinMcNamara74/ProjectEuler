
import java.math.BigInteger;

public class LargestPrimeFactor {

    static BigInteger numm;

    public static void main(String[] args) {
        numm = new BigInteger("600851475143");
        BigInteger newnumm = numm;
        BigInteger largestFact = new BigInteger("0");

    }

    boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
