package hw20200930_Set2;
//С использованием множеств реализовать функцию, которая вернет
//повторяющиеся элементы из данного списка: List<String> getDuplicates(List<String> input)
//Пример: {“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} -> {“Ivan”, “Maria”}

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        System.out.println(getDuplicates(input));
    }

    public static List<String> getDuplicates(List<String> input) {
        List<String> output = new ArrayList<>();
        Set<String> set = new HashSet<>();
        if (input.isEmpty()) return input;
        for (String s : input) {
            if (!set.add(s)) { //if not possible to add to set
                output.add(s); //add to the list
            }
        }
        return output;
    }
}
