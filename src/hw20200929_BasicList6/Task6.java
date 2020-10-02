package hw20200929_BasicList6;
//Объединить два списка в один

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        System.out.println(getUnitedList(list1, list2));
    }

    public static List<Integer> getUnitedList(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
                result.addAll(list1);
        result.addAll(list2);
        return result;
    }
}
