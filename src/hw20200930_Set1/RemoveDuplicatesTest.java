package hw20200930_Set1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest {
    @Test
    public void removeDuplicates_ListWithDuplicates_UpdatedList(){
        List<String> list = Arrays.asList("a", "b", "c", "c", "a");
        List<String> expected = Arrays.asList("a", "b", "c");
        assertEquals(expected, Task1.removeDuplicates(list));
    }

    @Test
    public void removeDuplicates_ListWithoutDuplicates_SameList(){
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        List<String> expected = Arrays.asList("a", "b", "c", "d", "e");
        assertEquals(expected, Task1.removeDuplicates(list));
    }

    @Test
    public void removeDuplicates_EmptyList_EmptyList(){
        List<String> list = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, Task1.removeDuplicates(list));
    }
}
