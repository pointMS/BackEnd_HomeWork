package hw20200927_BasicList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Есть два класса: Address с полями улица и номер дома и Person с полями имя и
//Address. Нужно написать функцию:
// List<Address> getAddresses(List<Person> persons) то есть по списку persons возвращать список их адресов.

public class Task1 {
    public static void main(String[] args) {

        List<Address> addresses = new ArrayList<>();
        Address address1 = new Address("Right street", 10);
        Address address2 = new Address("Left street", 14);
        Address address3 = new Address("Next street", 33);
        Address address4 = new Address("Side street", 26);

        List<Person> people = Arrays.asList(
                new Person("Ivan", address1),
                new Person("Paul", address2),
                new Person("Nick", address3),
                new Person("Tom", address4));

        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println(" - - - - - ");
        System.out.println(getAddress(people));
    }

    public static List<Address> getAddress(List<Person> people) {
        List<Address> list = new ArrayList<>();
        if(people == null) return null;
        for (Person p : people) {
            list.add(p.getAddress());
        }
        return list;
    }
}
