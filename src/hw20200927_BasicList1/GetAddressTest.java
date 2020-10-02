package hw20200927_BasicList1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class GetAddressTest {
    @Test
    public void getAddress_Null_Null() {
        List<Person> people = null;
        assertNull(Task1.getAddress(people));
    }

    @Test
    public void getAddress_NotNull_AddressList() {
        List<Person> people = Arrays.asList(
                new Person("Name1", new Address("street1", 1)),
                new Person("Name2", new Address("street2", 2)),
                new Person("Name3", new Address("street3", 3)));
        List<Address> expected = Arrays.asList(
                new Address("street1", 1),
                new Address("street2", 2),
                new Address("street3", 3));
        assertEquals(expected, Task1.getAddress(people));
    }

}