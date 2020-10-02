package hw20200929_BasicList7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoreThanLimitTest {
    @Test
    public void moreThanLimit_LessAndMoreLimitNumbers_NewList() {
        List<Integer> list = Arrays.asList(65, 14, 89, 22, 115);
        List<Integer> expected = Arrays.asList(65, 89, 115);
        assertEquals(expected, Task7.moreThanLimit(list));
    }

    @Test
    public void moreThanLimit_LessLimitNumbers_EmptyList() {
        List<Integer> list = Arrays.asList(25, 14, 19, 22, 11);
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Task7.moreThanLimit(list));
    }

    @Test
    public void moreThanLimit_MoreLimitNumbers_OriginalList() {
        List<Integer> list = Arrays.asList(125, 124, 219, 72, 51);
        List<Integer> expected = Arrays.asList(125, 124, 219, 72, 51);
        assertEquals(expected, Task7.moreThanLimit(list));
    }

    @Test
    public void moreThanLimit_EmptyList_EmptyList() {
        List<Integer> list = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, Task7.moreThanLimit(list));
    }
}
