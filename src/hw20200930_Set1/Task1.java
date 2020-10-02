package hw20200930_Set1;

// С использованием множеств (Set) реализовать функцию, которая вернет список
//без повторяющихся элементов:
//List<String> removeDuplicates(List<String> input)
//Пример: {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} -> {“Ivan”, “Maria”, “Piotr”, “Anna”}

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        System.out.println(removeDuplicates(input));
    }

    public static List<String> removeDuplicates(List<String> input) {
        if (input.isEmpty()) return input;
        Set<String> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }
}
