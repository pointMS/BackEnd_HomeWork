package hw20200928_BasicList4_not;

import java.util.Arrays;
import java.util.List;

//Есть два списка с буквами. Определить, является ли один список циклической версией другого.
//Например, для списков {aa, bb, cc, dd} и {cc, dd, aa, bb} результат будет true,
// а для {dd, ee, ff} и {dd, ff, ee} - false.

//not done!


public class Task4 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("aa", "bb", "cc", "dd");
        List<String> list2 = Arrays.asList("cc", "dd", "aa", "bb");

    }

    public static boolean checkCyclicSequence(List<String> list1, List<String> list2){

        for(String s : list1){

        }
        return false;
    }
}
