package hw20200927_BasicList2;

//Есть список с именами: Ivan, Maria, Stephan, John, Amalia. Написать функцию,
//которая вернет список, в котором не содержатся имена исходного списка, длиной 4.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Ivan");
        strings.add("Maria");
        strings.add("Stephan");
        strings.add("John");
        strings.add("Amalia");

        System.out.println(listHandler(strings));

    }

    public static List<String> listHandler(List<String> strings) {
        if (strings == null) return strings;
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.length() > 4) {
                result.add(str);
            }
        }
        return result;
    }
}
