package hw20201006_Map4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    @Test
    public void getNumber_EmptyList_EmptyMap() {
        List<String> list = new ArrayList<>();
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, Task4.getNumber(list));
    }

    @Test
    public void getNumber_NoDuplicatesList_MapWithKey1() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("A", 1);
        expected.put("B", 1);
        expected.put("C", 1);
        expected.put("D", 1);
        assertEquals(expected, Task4.getNumber(list));
    }

    @Test
    public void getNumber_WithDuplicatesList_MapWithDifferentKeys() {
        List<String> list = Arrays.asList("A", "B", "B", "B", "A");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("A", 2);
        expected.put("B", 3);
        assertEquals(expected, Task4.getNumber(list));
    }
}
