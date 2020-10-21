package hw1015_StreamAPI;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private Address address;
    private BankAccount bankAccount;
    List<String> bankAccounts;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, List<String> bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    public List<String> getBankAccounts() {
        return bankAccounts;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name;
    }
}
