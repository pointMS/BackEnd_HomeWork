package hw20200927_BasicList3;

//Есть два списка одинаковой длины с числами. Написать функцию, которая вернет список с элементами Yes или No,
// где значение на i-том месте зависит от того, равны ли элементы двух списков под номером i.
//Например, {1, 2, 3, 4} и {5, 2, 3, 8} вернет {No, Yes, Yes, No}

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(3);
        list2.add(8);

        System.out.println(compareNumbers(list1, list2));

    }

    public static List<String> compareNumbers(List<Integer> list1, List<Integer> list2) {
        List<String> result = new ArrayList<>();
        for (Integer integer1 : list1) {
            int index1 = list1.indexOf(integer1);
            for (Integer integer2 : list2) {
                int index2 = list2.indexOf(integer2);
                if (index1 == index2 && integer1 == integer2) {
                    result.add("Yes");
                }
                if (index1 == index2 && integer1 != integer2) {
                    result.add("No");
                }
            }
        }
        return result;
    }
}
