import java.util.ArrayList;
import java.util.Collections;

class Person {
    String id;
    String name;
    String firstName;
    String secondName;
    int age;

    public Person(String id, String name, String firstName, String secondName, int age) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + firstName.charAt(0) + "." + secondName.charAt(0) + ". - ";
    }
}

class Teacher extends Person {
    String kafedra;

    public Teacher(String id, String name, String firstName, String secondName, int age, String department) {
        super(id, name, firstName, secondName, age);
        this.kafedra = department;
    }

    @Override
    public String toString() {
        return super.toString() + "преподаватель, кафедры " + kafedra;
    }
}

class Student extends Person {
    String grup;

    public Student(String id, String name, String firstName, String secondName, int age, String group) {
        super(id, name, firstName, secondName, age);
        this.grup = group;
    }

    @Override
    public String toString() {
        return super.toString() + "студент, группа: " + grup;
    }
}

public class People {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Teacher("1", "Кораблев", "Анатолий", "Иванович", 78, "анализа данных и технологий программирования"));
        people.add(new Teacher("2", "Байрашева", "Венера", "Рустамовна", 18, "теоретической кибернетики"));
        people.add(new Teacher("3", "Миссаров", "Муккадас", "Дмухтасибович", 68, "анализа данных и технологий программирования"));
        people.add(new Student("4", "Гофуров", "Исломбек", "Элмурод-Угли", 22, "09-033"));
        people.add(new Student("5", "Тихонов", "Артур", "Эдуардович", 21, "09-011"));
        people.add(new Student("6", "Сазонов", "Даниил", "Тимурович", 20, "09-002"));
        people.add(new Student("7", "Минигареев", "Тимур", "Рустамович", 22, "09-032"));
        people.add(new Student("8", "Шерматов", "Аминджон", "Саидович", 22, "09-012"));

        Collections.sort(people, new java.util.Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                int result = p1.name.compareTo(p2.name);
                if (result == 0) {
                    result = p1.firstName.compareTo(p2.firstName);
                    if (result == 0) {
                        result = p1.secondName.compareTo(p2.secondName);
                    }
                }
                return result;
            }
        });

        System.out.println("\nВывод отсортированного списка");
        for (Person person : people) {
            System.out.println(person);
        }

        Person youngest = Collections.min(people, new java.util.Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });

        Person oldest = Collections.max(people, new java.util.Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.age, p2.age);
            }
        });

        System.out.println("\nСамый молодой: " + youngest.firstName + " " + youngest.name + " - " + youngest.age + " лет");
        System.out.println("Самый старший: " + oldest.firstName + " " + oldest.name + " - " + oldest.age + " лет");
    }
}
