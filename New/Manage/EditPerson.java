package New.Manage;

import New.Manage.Person;

import java.io.Serializable;

public class EditPerson implements Serializable {
    private int id;
    Person person;

    public EditPerson() {
    }

    public EditPerson(int id, Person person) {
        this.id = id;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "EditPerson{" +
                "id=" + id +
                ", person=" + person +
                '}';
    }
}
