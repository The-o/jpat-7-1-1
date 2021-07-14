package ru.netology.pyas;

public class Person {

    private String name;
    private String lastname;
    private Integer age;
    private String address = null;

    public Person(String name, String lastname, Integer age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public boolean hasAge() {
        return age != null;
    }

    public void happyBirthday() {
        if (!hasAge()) {
            return;
        }
        ++age;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
            .setLastname(lastname)
            .setAge(0)
            .setAddress(address);
    }

    @Override
    public String toString() {
        return lastname + " " + name + (hasAge() ? " " + age : "") + (hasAddress() ? " (" + address + ")" : "");
    }
}
