package hw20200927_BasicList2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ListHandlerTest {
    @Test
    public void listHandler_NullList_BaseList() {
        List<String> list = null;
        assertNull(Task2.listHandler(list));
    }

    @Test
    public void listHandler_DifferentLengthElements_NewList() {
        List<String> list = Arrays.asList("Ivan", "Maria", "Stephan", "John", "Amalia");
        List<String> expected = Arrays.asList("Maria", "Stephan", "Amalia");
        assertEquals(expected, Task2.listHandler(list));
    }

    @Test
    public void listHandler_ElementsLengthEqualsOrLess4_EmptyList() {
        List<String> list = Arrays.asList("1234", "123", "325", "6666", "8585");
        List<String> expected = new ArrayList<>();
        assertEquals(expected, Task2.listHandler(list));
    }

    @Test
    public void listHandler_ElementsLengthMore4_SameList() {
        List<String> list = Arrays.asList("XXXXX", "PPPPPPP", "VVVVVVV", "NNNNNNNN", "DDDDDDD");
        List<String> expected = Arrays.asList("XXXXX", "PPPPPPP", "VVVVVVV", "NNNNNNNN", "DDDDDDD");
        assertEquals(expected, Task2.listHandler(list));
    }

}