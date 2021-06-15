package New.Menu;


import New.Manage.Person;
import New.Manage.EditPerson;
import New.Method.MethodPerson;
import New.Method.MethodEditPerson;

import java.util.Scanner;

public class Main {
    static Method method = new Method();
    static Scanner scanner = new Scanner(System.in);
    static MethodPerson methodPerson = new MethodPerson();
    static MethodEditPerson methodEditPerson = new MethodEditPerson();

    public static void main(String[] args) {
        startMenu:
        do {
            try {
                System.out.println("--------Menu--------");
                System.out.println("1: Liên Hệ ");
                System.out.println("2: Quản Liên hệ");
                System.out.println("4: Exit ");

                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Liên Hệ");
                        System.out.println("1: Thêm ");
                        System.out.println("2: Sửa thông tin  ");
                        System.out.println("3: Xóa  ");
                        System.out.println("4: Hiển thị thông tin  ");
                        System.out.println("5: Quay lại Menu ");
                        int choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1: {
                                Person a = method.getInfoPerson();
                                methodPerson.add(a);
                                break;
                            }
                            case 2: {
                                System.out.println("Tên người muốn sửa: ");
                                String name = scanner.nextLine();
                                methodPerson.update(name);
                                break;
                            }
                            case 3: {
                                System.out.println("Tên người muốn xóa: ");
                                String name = scanner.nextLine();
                                methodPerson.delete(name);
                                break;
                            }
                            case 4: {
                                methodPerson.show();
                                break;
                            }
                            case 5:
                                continue startMenu;
                        }
                    case 2:
                        System.out.println("Quản Lý Liên Hệ");
                        System.out.println("1: Thêm vị trí  ");
                        System.out.println("2: Sửa  vị trí ");
                        System.out.println("3: Xóa vị trí ");
                        System.out.println("4: Hiển thị vị trí lien hệ ");
                        System.out.println("5: Quay Lại Menu");
                        int choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2) {
                            case 1: {
                                EditPerson editPerson = method.getInfoEditPerson();
                                methodEditPerson.add(editPerson);
                                break;
                            }
                            case 2: {
                                System.out.println("Nhập vị trí muốn sửa");
                                int id = Integer.parseInt(scanner.nextLine());
                                System.out.println("Nhập lại  ");
                                methodEditPerson.update(id);
                                break;
                            }
                            case 4: {
                                methodEditPerson.show();
                                break;
                            }
                            case 3: {
                                System.out.println("Nhập vị trí cần xóa ");
                                int id = Integer.parseInt(scanner.nextLine());
                                methodEditPerson.delete(id);
                                break;
                            }
                            case 5: {
                                continue startMenu;
                            }
                        }
                }

            } catch (Exception e) {
            }
        } while (true);
    }
}
