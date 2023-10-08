import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        BigInteger factorial = Factorial(n);

        System.out.println("Факториал " + n + " = " + factorial);
    }

    public static BigInteger Factorial(int n) {
        BigInteger res = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
