import java.util.Scanner;

public class IsOneInTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String word1 = scanner.next();

        System.out.print("Введите вторую строку: ");
        String word2 = scanner.next();

        boolean isOneInTwo = oneInTwo(word1, word2);

        System.out.println(isOneInTwo);
    }

    public static boolean oneInTwo(String word1, String word2) {
        int word1_len = word1.length();
        int word2_len = word2.length();

        if (word1_len > word2_len)  return false;


        for (int i = 0; i <= word2_len - word1_len; i++) {
            boolean match = true;
            for (int j = 0; j < word1_len; j++)
                if (word1.charAt(j) != word2.charAt(i + j)) {
                    match = false;
                    break;
                }
            if (match == true)  return true;

        }
        return false;
    }
}



