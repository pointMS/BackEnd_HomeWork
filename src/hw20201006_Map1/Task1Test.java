package hw20201006_Map1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public void mapAB_MapContainsBothSymbols_updatedMap(){
        Map<String, String> map = new HashMap<>();
        map.put("a", "123");
        map.put("b", "456");
        Map<String, String> expected = new HashMap<>();
        expected.put ("a", "123");
        expected.put ("ab", "123456");
        expected.put ("b", "456");
        assertEquals(expected, Task1.mapAB(map));
    }

    @Test
    public void mapAB_MapContainsOnlyOneSymbol_baseMap(){
        Map<String, String> map = new HashMap<>();
        map.put("a", "123");
        map.put("c", "321");
        Map<String, String> expected = new HashMap<>();
        expected.put ("a", "123");
        expected.put ("c", "321");
        assertEquals(expected, Task1.mapAB(map));
    }

    @Test
    public void mapAB_EmptyMap_EmptyMap(){
        Map<String, String> map = new HashMap<>();
        Map<String, String> expected = new HashMap<>();
        assertEquals(expected, Task1.mapAB(map));
    }
}
