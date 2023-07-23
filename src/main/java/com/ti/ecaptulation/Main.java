package com.ti.ecaptulation;

class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;

}
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Girl");
        person.setAge(34);

        System.out.println("Name: "+ person.getName() + "Age: " + person.getName());

    }
}
