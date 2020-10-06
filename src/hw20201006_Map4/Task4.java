package hw20201006_Map4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Дан список имен, где некоторые имена повторяются. Написать функцию,
//которая по имени вернет количество вхождений этого имени в список.
public class Task4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ivan", "Peter", "Nick", "Nick", "Anna", "Anna", "Anna");
        System.out.println(getNumber(list));
    }

    public static Map<String, Integer> getNumber(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        if (!list.isEmpty()) {
            for (String s : list) {
                if (!result.containsKey(s)) {
                    result.put(s, 1);
                } else result.put(s, result.get(s) + 1);
            }
        }
        return result;
    }
}
