package hw20200927_BasicList3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareNumbersTest {
    @Test
    public void compareNumbers_AllNumbersEqual_Yes() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        List<String> expected = Arrays.asList("Yes", "Yes", "Yes", "Yes");
        assertEquals(expected, Task3.compareNumbers(list1, list2));
    }

    @Test
    public void compareNumbers_NoEqualNumbers_No() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9);
        List<String> expected = Arrays.asList("No", "No", "No", "No");
        assertEquals(expected, Task3.compareNumbers(list1, list2));
    }

    @Test
    public void compareNumbers_EqualNumbersDifferentIndex_No() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(6, 1, 4, 9);
        List<String> expected = Arrays.asList("No", "No", "No", "No");
        assertEquals(expected, Task3.compareNumbers(list1, list2));
    }

    @Test
    public void compareNumbers_EqualNumbersSameIndex_YesNo() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 7, 3, 9);
        List<String> expected = Arrays.asList("Yes", "No", "Yes", "No");
        assertEquals(expected, Task3.compareNumbers(list1, list2));
    }
}