package ru.netology.pyas;

public class PersonBuilder {
    private String name = null;
    private String lastname = null;
    private Integer age = null;
    private String address = null;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Не указано имя");
        }
        if (lastname == null) {
            throw new IllegalStateException("Не указана фамилия");
        }
        if (age != null && age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }

        Person person = new Person(name, lastname, age);
        person.setAddress(address);

        return person;
    }
}
