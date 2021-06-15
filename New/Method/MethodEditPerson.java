package New.Method;

import Manage.Computer;
import Method.ReadAndWrite;
import New.Manage.EditPerson;

import java.util.ArrayList;

public class MethodEditPerson  {
    static ArrayList<EditPerson> editPersons = new ArrayList<>();
    final String PATH = "C:\\Users\\Administrator\\Desktop\\src\\EditPerson.dat";
    public MethodEditPerson(){ editPersons = (ArrayList<EditPerson>) ReadAndWrite.readFromFile(PATH);
    }

    public void add(EditPerson editPerson){

        editPersons.add(editPerson);
        ReadAndWrite.writeObjectToFile(editPersons,PATH);
    }

    public void show(){
        for (EditPerson i : editPersons) {
            System.out.println(i.toString());
        }
    }

    public void update(int id){
        for (EditPerson i : editPersons) {
            if(i.getId() == id){
            }
        }
        ReadAndWrite.writeObjectToFile(editPersons,PATH);
    }
    public void delete(int id){
        for (EditPerson i : editPersons) {
            if (i.getId()== id){
                editPersons.remove(i);
                break;
            }
        }
        ReadAndWrite.writeObjectToFile(editPersons,PATH);
    }

    public EditPerson getEditPersonById(int id){
        EditPerson editPerson = null;
        for (EditPerson b : editPersons) {
            if(b.getId() == id){
                editPerson = b;
            }
        }
        return editPerson;
    }

    public boolean checkId(int id){
        boolean a = true;
        for (EditPerson b : editPersons) {
            a = b.getId() != id;
        }
        return a;
    }
}
