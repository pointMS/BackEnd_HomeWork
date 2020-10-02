package hw20200930_Set2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GetDuplicatesTest {
    @Test
    public void getDuplicates_ListWithDuplicates_OnlyDuplicates() {
        List<String> list = Arrays.asList("1", "2", "3", "4", "1", "4");
        List<String> expected = Arrays.asList("1", "4");
        assertEquals(expected, Task2.getDuplicates(list));
    }

    @Test
    public void getDuplicates_ListWithOutDuplicates_EmptyList() {
        List<String> list = Arrays.asList("1", "2", "3", "4");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, Task2.getDuplicates(list));
    }

    @Test
    public void getDuplicates_EmptyList_EmptyList() {
        List<String> list = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, Task2.getDuplicates(list));
    }
}
