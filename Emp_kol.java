import java.util.ArrayList;
import java.util.List;


class Employee {
    private String FIO;
    private String jobT;
    private double zp;

    public Employee(String name, String job_title, double money) {
        this.FIO = name;
        this.jobT = job_title;
        this.zp = money;
    }

    public String getFIO() {
        return FIO;
    }

    public String getJobT() {
        return jobT;
    }

    public double getZp() {
        return zp;
    }

    public String toString() {
        return "Работник: " + FIO + ", Должность: " + jobT  + ", Зарплата:  " + zp;
    }
}

public class Emp_kol {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Даниил Тимуровчи", "Программист", 50000));
        employees.add(new Employee("Исломбек Гофурович", "Разработчик", 60000));
        employees.add(new Employee("Артур Эдуардович", "Аналитик", 45000));
        employees.add(new Employee("Тимур Рустамович", "Юрист", 41000));

        for (int i = 0; i < employees.size() - 1; i++)
            for (int j = i + 1; j < employees.size(); j++)
                if (employees.get(i).getZp() < employees.get(j).getZp()) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, temp);
                }

        System.out.println("Сортировка по зарплате:");
        for (Employee emp : employees)
            System.out.println(emp);


        for (int i = 0; i < employees.size() - 1; i++)
            for (int j = 0; j < employees.size() - 1 - i; j++)
                if (employees.get(j).getFIO().compareTo(employees.get(j + 1).getFIO()) > 0) {
                    Employee temp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }

        System.out.println("\nСортировка по имени:");
        for (Employee emp : employees)
            System.out.println(emp);
    }
}
