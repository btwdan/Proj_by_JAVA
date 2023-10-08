import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int num_first = in.nextInt();
        System.out.print("Input a second number: ");
        int num_second = in.nextInt();

        System.out.print("What u  need? (/,+,*,-): ");
        String solution = in.next();

        if (solution.equals("+")){
            System.out.print(num_first + num_second);
        }
        if (solution.equals("-")){
            System.out.print(num_first - num_second);
        }
        if(solution.equals("*")){
            System.out.print(num_first * num_second);
        }
        if(solution.equals("/")){
            System.out.print(num_first / num_second);
        }

        in.close();
    }
}