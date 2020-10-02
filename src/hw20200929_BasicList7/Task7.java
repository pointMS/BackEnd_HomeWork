package hw20200929_BasicList7;
//Есть список с целыми числами. Написать функцию, которая вернет список без элементов, больше заданного.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(15, 2, 68, 32, 154, 10, 46, 79);
        System.out.println(moreThanLimit(list));

    }

    public static List<Integer> moreThanLimit (List<Integer> list) {
        int limit = 50;
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (i > limit) {
                result.add(i);
            }
        }
        return result;
    }
}
