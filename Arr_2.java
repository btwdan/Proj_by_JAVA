import java.util.*;

public class Arr_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int maxLength = 0;
        int index = -1;
        int current = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] == 1) {
                if (current == 0) {
                    index = i;
                }
                current++;
            } else {
                if (current > maxLength) {
                    maxLength = current;
                }
                current = 0;
            }
        }

        if (current > maxLength) {
            maxLength = current;
        }

        if (maxLength > 0) {
            System.out.println("Самая длинная последовательность единиц:");
            System.out.println("Индекс первой единицы: " + index);
            System.out.println("Длина последовательности: " + maxLength);
        } else {
            System.out.println("В массиве нет последовательностей из единиц.");
        }
    }
}