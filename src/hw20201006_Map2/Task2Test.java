package hw20201006_Map2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    public void wordMultiple_ArrayHasDuplicates_MapWithTrue() {
        String[] arr = {"b", "n", "b", "n", "p"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("b", true);
        expected.put("n", true);
        expected.put("p", false);
        assertEquals(expected, Task2.wordMultiple(arr));
    }

    @Test
    public void wordMultiple_ArrayHasNoDuplicates_MapWithFalse() {
        String[] arr = {"b", "t", "y", "n"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("b", false);
        expected.put("t", false);
        expected.put("y", false);
        expected.put("n", false);
        assertEquals(expected, Task2.wordMultiple(arr));
    }

    @Test
    public void wordMultiple_ArrayOnlyDuplicates_MapWithTrue() {
        String[] arr = {"b", "b", "b"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("b", true);
        assertEquals(expected, Task2.wordMultiple(arr));
    }

    @Test
    public void wordMultiple_EmptyArray_EmptyMap() {
        String[] arr = {};
        Map<String, Boolean> expected = new HashMap<>();
        assertEquals(expected, Task2.wordMultiple(arr));
    }
}
