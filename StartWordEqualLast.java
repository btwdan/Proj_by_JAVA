import java.util.Scanner;

public class StartWordEqualLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        String strLow = str.toLowerCase();
        String current = "";

        for (int i = 0; i < strLow.length(); i++) {
            if (strLow.charAt(i) != ' ')  current += strLow.charAt(i);
            else {
                isWord(current);
                current = "";
            }

            if (i == strLow.length() - 1)  isWord(current);
        }
    }

    public static void isWord(String word) {
        if (word.length() >= 2 && word.charAt(0) == word.charAt(word.length() - 1))
            System.out.println(word);
    }
}
