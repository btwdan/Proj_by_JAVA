import java.util.*;

public class Arr_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность квадратной матрицы: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isMagicSquare = checkMagic(matrix);

        if (isMagicSquare) {
            System.out.println("Данная матрица является магическим квадратом.");

            System.out.println("Исходная матрица:");
            printMatrix(matrix);

            rotateClock(matrix);

            System.out.println("Повернутая матрица:");
            printMatrix(matrix);
        } else {
            System.out.println("Данная матрица не является магическим квадратом.");
        }
    }

    public static boolean checkMagic(int[][] matrix) {
        int n = matrix.length;

        // Вычисляем сумму элементов по первой строке
        int target = 0;
        for (int i = 0; i < n; i++) {
            target += matrix[0][i];
        }

        // Проверяем суммы по строкам
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != target) {
                return false;
            }
        }

        // Проверяем суммы по столбцам
        for (int i = 0; i < n; i++) {
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                colSum += matrix[j][i];
            }
            if (colSum != target) {
                return false;
            }
        }

        // Проверяем сумму по главной диагонали
        int mainDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        if (mainDiagonalSum != target) {
            return false;
        }

        // Проверяем сумму по побочной диагонали
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }
        if (secondaryDiagonalSum != target) {
            return false;
        }

        return true;
    }

    public static void rotateClock(int[][] matrix) {
        int n = matrix.length;

        // Транспонируем матрицу
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Переворачиваем каждую строку
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}