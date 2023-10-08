import java.util.*;

public class Arr_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер вектора: ");
        int size = scanner.nextInt();

        int[] vector = new int[size];
        System.out.println("Введите элементы вектора:");
        for (int i = 0; i < size; i++) {
            vector[i] = scanner.nextInt();
        }

        int[] result = zero(vector);
        System.out.println("Результат:");
        System.out.println(Arrays.toString(result));
    }

    public static int[] zero(int[] vector) {
        int[] shift = Arrays.copyOf(vector, vector.length);
        for (int i = 0; i < shift.length; i++) {
            if (isPrime(shift[i])) {
                shift[i] = 0;
            }
        }
        int lastElement = shift[shift.length - 1];
        System.arraycopy(shift, 0, shift, 1, shift.length - 1);
        shift[0] = lastElement;
        return shift;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}