package hw20200929_BasicList6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetUnitedListTest {
    @Test
    public void getUnitedList_TwoLists_NewList() {
        List<Integer> list1 = Arrays.asList(5, 6, 7);
        List<Integer> list2 = Arrays.asList(10, 11, 12);
        List<Integer> expected = Arrays.asList(5, 6, 7, 10, 11, 12);
        assertEquals(expected, Task6.getUnitedList(list1, list2));
    }

    @Test
    public void getUnitedList_OneListEmpty_NewList() {
        List<Integer> list1 = Arrays.asList(5, 6, 7);
        List<Integer> list2 = new ArrayList<>();
        List<Integer> expected = Arrays.asList(5, 6, 7);
        assertEquals(expected, Task6.getUnitedList(list1, list2));
    }
}
