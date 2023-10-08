import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String name;
    private int time;

    public Student(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public String toString() {
        return name + ": " + time + " мин";
    }
}

class Results {
    private ArrayList<Student> students;

    public Results(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> sortTime(boolean ascending) {
        ArrayList<Student> sortStud = new ArrayList<>(students);
        Comparator<Student> comparator = Comparator.comparingInt(Student::getTime);

        if (!ascending) {
            comparator = comparator.reversed();
        }

        Collections.sort(sortStud, comparator);
        return sortStud;
    }

    public Student getWin() {
        return sortTime(true).get(0);
    }

    public ArrayList<Student> getTop3() {
        ArrayList<Student> sortedStudents = sortTime(true);
        int endIndex = Math.min(3, students.size());
        ArrayList<Student> getTop3 = new ArrayList<>(sortedStudents.subList(0, endIndex));
        return getTop3;
    }

    public double getAVG() {
        int total = 0;
        for (Student student : students) {
            total += student.getTime();
        }
        return (double) total / students.size();
    }

    public int getNumMan() {
        return students.size();
    }
}

public class Sorev {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Даня", 120));
        students.add(new Student("Артур", 110));
        students.add(new Student("Исломбек", 133));
        students.add(new Student("Тимур", 118));
        students.add(new Student("Рауль", 112));

        Results results = new Results(students);

        ArrayList<Student> sortTime = results.sortTime(true);
        System.out.println("Сортировка по времени: " + sortTime);

        Student win = results.getWin();
        System.out.println("Пообедитель: " + win);

        ArrayList<Student> top3 = results.getTop3();
        System.out.println("ТОП 3: " + top3);

        double avg = results.getAVG();
        System.out.println("Среднее время: " + avg + " minutes");

        int manCount = results.getNumMan();
        System.out.println("Количество участников: " + manCount);
    }
}
