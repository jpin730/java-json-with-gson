package dev.jpineda.nested;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private boolean isActive;
    private List<String> hobbies;

    public Person(String name, int age, boolean isActive, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
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
                ", hobbies=" + hobbies +
                '}';
    }
}
