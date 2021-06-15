package New.Method;

import Manage.Player;
import Method.ReadAndWrite;
import New.Manage.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodPerson {
    static ArrayList<Person> persons = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    final String PATH = "C:\\Users\\Administrator\\Desktop\\src\\Person.dat";

    public MethodPerson() {
        persons = (ArrayList<Person>) ReadAndWrite.readFromFile(PATH);
    }

    public Person getPersonByName(String name) {
        Person a = null;
        for (Person i : persons) {
            if (i.getName().equals(name)) {
                a = i;
            }
        }
        return a;
    }

    public void add(Person person) {
        persons.add(person);
        ReadAndWrite.writeObjectToFile(persons,PATH);
    }

    public void show() {
        for (Person a : persons) {
            System.out.println(a.toString());
        }
    }

    public void update(String name) {
        for (Person i : persons) {
            if (i.getName().equals(name)) {
                System.out.println("Nhập thông tin mới của người  này ");
                System.out.println("- Tuổi ?");
                int age = Integer.parseInt(scanner.nextLine());
                i.setAge(age);
                System.out.println("Phone ?");
                String phone = scanner.nextLine();
                i.setQh(phone);
                System.out.println("- MQH ?");
                String qh = scanner.nextLine();
                i.setQh(qh);
            }
        }
    }

    public void delete(String name) {
        persons.removeIf(c -> c.getName().equals(name));
        ReadAndWrite.writeObjectToFile(persons, PATH);
    }
}

