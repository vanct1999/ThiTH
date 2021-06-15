package New.Manage;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String phone;
    private int age;
    private String qh;

    public Person(){}

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person(String name, int age, String qh, String phone) {
        this.name = name;
        this.age = age;
        this.qh = qh;
        this.phone=phone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQh() {
        return qh;
    }

    public void setQh(String qh) {
        this.qh = qh;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", qh='" + qh + '\'' +
                '}';
    }
}
