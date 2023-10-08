import java.math.BigInteger;
import java.util.Scanner;

public class Febonach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        BigInteger sum = BigInteger.ZERO;
        BigInteger fib_Prev = BigInteger.ZERO;
        BigInteger fib_Current = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            BigInteger temp = fib_Current;
            fib_Current = fib_Current.add(fib_Prev);
            fib_Prev = temp;
            sum = sum.add(fib_Prev);
        }

        System.out.println("Сумма первых " + n + " чисел Фибоначчи: " + sum);
        System.out.println( n + " число Фибоначчи: " + fib_Prev);
    }
}
