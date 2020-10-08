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
        //System.out.println(getNumber(list));

        System.out.println(getNumber2(list, "Nick"));
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

    //принимает строку, возвращает число
    public static int getNumber2(List<String> list, String name){
        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        if (!list.isEmpty()) {
            for (String s : list) {
                if (!map.containsKey(s)) {
                    map.put(s, 1);
                } else map.put(s, map.get(s) + 1);
                if (s.equals(name)) {
                    result ++;
                }
            }
        }
        System.out.println("Name is : " + name);
        return result;
    }
}
