import java.util.ArrayList;

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
    private ArrayList<Employee> empList;

    public Accounting(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public void calcBon() {
        for (Employee employee : empList) {
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
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Илсломбек", 3, 5));
        empList.add(new Employee("Артур", 7, 2));
        empList.add(new Employee("Даниил", 2, 8));

        Accounting accounting = new Accounting(empList);
        accounting.calcBon();
    }
}
