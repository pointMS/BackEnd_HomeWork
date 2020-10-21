package hw1015_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //1.написать функцию, которая по списку persons вернет список адресов тех людей, чей возраст больше 17 лет.
        Person p1 = new Person("Ivan", 35, new Address("Street1", 12));
        Person p2 = new Person("Anna", 16, new Address("Street4", 9));
        Person p3 = new Person("Tom", 12, new Address("Street3", 34));
        Person p4 = new Person("Nick", 21, new Address("Street2", 8));
        List<Person> list = Arrays.asList(p1, p2, p3, p4);

        list.stream().filter(person -> person.getAge() > 17).map(Person::getAddress).forEach(System.out::println);
        // using "collect"
        List<Address> collect = list.stream().filter(person -> person.getAge() > 17)
                .map(Person::getAddress).collect(Collectors.toList());
        System.out.println("Task 1: " + collect);

        //2.Есть список имен, нужно написать функцию, которая вернет список имен без дубликатов.
        List<String> names = Arrays.asList("Ivan", "Stefan", "Anna", "Sabrina", "Alex", "Stefan", "Anna");
        names.stream().distinct().forEach(System.out::println);
        // using "collect"
        List<String> collect1 = names.stream().distinct().collect(Collectors.toList());
        System.out.println("Task 2: " + collect1);

        //3.Есть список людей, нужно написать функцию, которая вернет мапу, где ключом является возраст,
        // а значением список людей этого возраста.
        Person p5 = new Person("Alex", 30);
        Person p6 = new Person("Mattias", 42);
        Person p7 = new Person("Anna", 28);
        Person p8 = new Person("Stefanie", 30);
        Person p9 = new Person("Robert", 28);
        List<Person> list1 = Arrays.asList(p5, p6, p7, p8, p9);

        Map<Object, List<Person>> map = list1.stream().distinct().collect(Collectors.groupingBy(Person::getAge));
        System.out.println("Task 3. Age as a key: " + map);

        //4. Есть два класса:   BankAccount, Person.  написать функцию, которая возвращает мапу,
        // где ключом является Person, а значением - список его банковских счетов.

        BankAccount a1 = new BankAccount("1234 5678 9101 9874", new Person("Ivan"));
        BankAccount a2 = new BankAccount("8888 9999 1010 3333", new Person("Anna"));
        BankAccount a3 = new BankAccount("7878 9898 4545 3232", new Person("Anna"));
        BankAccount a4 = new BankAccount("2626 3535 4848 6868", new Person("Ivan"));
        BankAccount a5 = new BankAccount("8787 5454 2121 6565", new Person("Sylvie"));
        List<BankAccount> list2 = Arrays.asList(a1, a2, a3, a4, a5);

        Map<Object, List<BankAccount>> map1 = list2.stream().distinct()
                .collect(Collectors.groupingBy(person -> person.getOwner().getName()));
        map1.forEach((k, v) -> System.out.println("Task 4. Name as a key: " + k + " = " + v));
        //System.out.println("Name as a key: " + map1);

        //5.  Написать функцию, которая для списка счетов, возвращает список IBANs,
        //где в каждом IBAN символы после 3-го и до конца заменены звездочками.
        Stream<String> list3 = list2.stream().map(BankAccount::getIBAN);
        List<String> collect2 = list3.map(s -> s.substring(0, 3).concat("* **** **** ****")).collect(Collectors.toList());
        System.out.println("Task 5: ");
        collect2.forEach(System.out::println);

        //6.Написать функцию, которая принимает предложение, а возвращает количество слов, начинающихся на заданную букву.
        String sentence = "Написать функцию, которая принимает предложение, а возвращает количество слов";
        List<String> strings = Arrays.asList(sentence.split(" "));
        int n = (int) strings.stream().filter(s -> s.startsWith("к")).count();
        System.out.println("Task 6: " + n);

        //7.Написать функцию, которая проверяет, является ли заданная строка целым числом. Подсказка - Character.isDigit() & Stream.allMatch()
        String str1 = "12345";
        String str2 = "abcde";
        boolean b1 = str1.chars().allMatch(Character::isDigit);
        boolean b2 = str2.chars().allMatch(Character::isDigit);
        System.out.println("Task 7: " + b1);
        System.out.println("Task 7: " + b2);

        //8-9. Есть два класса BankAccount & Person
        // Написать функцию, которая по списку persons возвращает список их
        //банковских счетов с звездочками с третьего символа. Подсказка - flatMap()

        Person p10 = new Person("Tomas", Arrays.asList("1111 2222 3333 4444", "2222 22222 2222 22222"));
        Person p11 = new Person("Uwe", Arrays.asList("4444 4444 4444 4444", "7777 7777 7777 7777"));
        List<Person> people = Arrays.asList(p10, p11);
        System.out.println("Task 8-9: ");
        people.stream().flatMap(p -> p.getBankAccounts().stream())
                .map(s -> s.substring(0, 3).concat("* **** **** ****")).forEach(System.out::println);

        //10.  Для списка persons посчитать общий возраст тех, кому больше 17 лет. Подсказка - reduce()
        List<Person> list4 = Arrays.asList(
                new Person("Anna", 18),
                new Person("Ivan", 27),
                new Person("Petr", 31),
                new Person("Alex", 12),
                new Person("Tom", 16));

        Optional<Integer> reduce = list4.stream().filter(p -> p.getAge() > 17).map(Person::getAge).reduce(Integer::sum);
        System.out.println("Task 10: " + reduce);

        //11. Написать функцию, которая для списка persons напечатает для тех, кто старше 17 лет:
        // In Germany <name1> and <name2> and …<nameN> are of legal age. Подсказка - Collectors.joining();
        String collect3 = list4.stream().filter(p -> p.getAge() > 17).map(Person::getName)
                .collect(Collectors.joining(" and "));
        System.out.println("Task 11: In Germany " + collect3 + " are of legal age");
    }
}
