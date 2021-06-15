package New.Menu;


import New.Manage.*;

import java.util.ArrayList;
import java.util.Scanner;

import New.Method.*;

public class Method {

    MethodPerson methodPerson = new MethodPerson();
    MethodEditPerson methodEditPerson = new MethodEditPerson();
    int id = 1;
    Scanner scanner = new Scanner(System.in);

    public EditPerson getInfoEditPerson() {
        boolean checkId = false;
        EditPerson editPerson = new EditPerson();

        while (!checkId) {
            System.out.println("Nhập số thứ tự:");
            id = Integer.parseInt(scanner.nextLine());
            checkId = methodEditPerson.checkId(id);
            if (!checkId) {
                System.err.println("Id đã tồn tại.");
            }

            editPerson.setId(id);
            System.out.println("Nhập vào tên liên hệ mới ");
            String name = scanner.nextLine();
            Person a = methodPerson.getPersonByName(name);
            editPerson.setPerson(a);

        }
    return editPerson;
    }

    public Person getInfoPerson() {
        Person p = new Person();
        System.out.println("Nhập tên liên hệ");
        String name = scanner.nextLine();
        p.setName(name);
        System.out.println("Nhập tuổi ");
        int age = Integer.parseInt(scanner.nextLine());
        p.setAge(age);
        System.out.println(" MQH ?");
        String qh = scanner.nextLine();
        p.setQh(qh);
        return p;
    }
}
