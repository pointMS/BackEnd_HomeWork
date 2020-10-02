package hw20200929_BasicList5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseTest {
    @Test
    public void reverse_EmptyList_EmptyList() {
        List<Integer> list = new ArrayList<>();
        assertEquals(list, Task5.reverse(list));
    }

    @Test
    public void reverse_NotEmptyList_ReversedList() {
        List<Integer> list = Arrays.asList(5, 6, 7, 8, 9);
        List<Integer> expected = Arrays.asList(9, 8, 7, 6, 5);
        assertEquals(expected, Task5.reverse(list));
    }

}