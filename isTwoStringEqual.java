import java.util.Scanner;

public class isTwoStringEqual {
    public static boolean compareStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String word1 = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String word2 = scanner.nextLine();

        boolean result = compareStrings(word1, word2);

        System.out.println(result);
    }
}
