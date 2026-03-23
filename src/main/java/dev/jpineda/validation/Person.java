package dev.jpineda.validation;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private boolean isActive;
    private String email;
    private List<String> hobbies;

    public Person(String name, int age, boolean isActive, String email, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.email = email;
        this.hobbies = hobbies;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                ", email='" + email + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
