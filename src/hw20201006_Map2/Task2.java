package hw20201006_Map2;
//Дан массив букв, вернуть мапу Map<String, Boolean> где каждая строка является ключем,
// а значением - true, если строка в массиве больше одного раза и false, если только один раз.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        String[] arr1 = {"a", "b", "a", "c", "b"};
        String[] arr2 = {"a", "c", "b"};
        String[] arr3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(arr1));
        System.out.println(wordMultiple(arr2));
        System.out.println(wordMultiple(arr3));

    }

    public static Map<String, Boolean> wordMultiple(String[] arr) {
        Map<String, Boolean> result = new HashMap<>();
        if (arr.length > 0) {
            Set<String> set = new HashSet<>();
            for (String s : arr) {
                if (!set.add(s)) {
                    result.put(s, true);
                } else {
                    result.put(s, false);
                }
            }
        }
        return result;
    }
}
