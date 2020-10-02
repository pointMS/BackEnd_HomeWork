package hw20200929_BasicList5;
//Написать функцию, которая реверсирует список, возвращает список элементов в обратном порядке.
//{1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1}

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7);
        System.out.println("base list: " + list);
        System.out.println("reversed list: " + reverse(list));

    }

    public static List<Integer> reverse(List<Integer> list) {
        if (list.size() == 0) return list;
        Collections.reverse(list);
        return list;
    }
}
