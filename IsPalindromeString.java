import java.util.Scanner;

public class IsPalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        String strLow = str.toLowerCase();

        int count = 0;
        String currentWord = "";

        for (int i = 0; i < strLow.length(); i++) {
            char currentChar = strLow.charAt(i);

            if (currentChar != ' ')
                currentWord += currentChar;
             else {
                if (isPalindrome(currentWord))
                    count++;

                currentWord = "";
            }

            if (i == strLow.length() - 1)
                if (isPalindrome(currentWord))
                    count++;
        }

        System.out.println("Количество палиндромов: " + count);
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++)
            if (word.charAt(i) != word.charAt(length - 1 - i)) return false;

        return true;
    }
}
