package hw20201006_Map1;
//Дана Map<String, String> map, написать функцию, которая вернет Мап, такую, если в Исходной map есть ключ ‘a’ и ‘b’,
// то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b.

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");

        System.out.println(mapAB(map1));
        System.out.println(mapAB(map2));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (!map.isEmpty()) {
            if (map.containsKey("a") && map.containsKey("b")) {
                map.put("ab", map.get("a").concat(map.get("b")));
            }
        }
        return map;
    }
}
