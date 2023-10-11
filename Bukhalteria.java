import java.util.Scanner;

class Employee {
    private String name;
    private int exp;
    private int newbie;

    public Employee(String name, int experience, int newbieCount) {
        this.name = name;
        this.exp = experience;
        this.newbie = newbieCount;
    }

    public String getName() {
        return name;
    }

    public int getExp() {
        return exp;
    }

    public int getNewbie() {
        return newbie;
    }
}

class Accounting {
    private Employee[] empArray;

    public Accounting(Employee[] empArray) {
        this.empArray = empArray;
    }

    public void calcBon() {
        for (Employee employee : empArray) {
            if (employee.getNewbie() > 3 && employee.getExp() <= 6) {
                System.out.println("Сотрудник " + employee.getName() + " НЕ имеет повышеную премию.");
            } else {
                System.out.println("Сотрудник " + employee.getName() + " имеет повышеную премию.");
            }
        }
    }
}

public class Bukhalteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого сотрудника: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите стаж первого сотрудника: ");
        int exp1 = scanner.nextInt();
        System.out.print("Введите количество новичков под руководством первого сотрудника: ");
        int newbie1 = scanner.nextInt();

        System.out.print("Введите имя второго сотрудника: ");
        String name2 = scanner.next();
        System.out.print("Введите стаж второго сотрудника: ");
        int exp2 = scanner.nextInt();
        System.out.print("Введите количество новичков под руководством второго сотрудника: ");
        int newbie2 = scanner.nextInt();

        System.out.print("Введите имя третьего сотрудника: ");
        String name3 = scanner.next();
        System.out.print("Введите стаж третьего сотрудника: ");
        int exp3 = scanner.nextInt();
        System.out.print("Введите количество новичков под руководством третьего сотрудника: ");
        int newbie3 = scanner.nextInt();

        Employee[] empArray = {
                new Employee(name1, exp1, newbie1),
                new Employee(name2, exp2, newbie2),
                new Employee(name3, exp3, newbie3)
        };

        Accounting accounting = new Accounting(empArray);
        accounting.calcBon();

        scanner.close();
    }
}
