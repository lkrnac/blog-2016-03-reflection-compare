package net.lkrnac.blog.reflectioncompare;

import org.junit.Test;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

public class VerifyObjectsTest {
    @Test
    public void testObjectsSuccess() {
        Address expectedAddress = new Address("Barad-dûr", "Mount Doom", "Mordor", "1");
        Person expectedPerson = new Person("Sauron", null, expectedAddress);

        Address actualAddress = new Address("Barad-dûr", "Mount Doom", "Mordor", "1");
        Person actualPerson = new Person("Sauron", null, actualAddress);

        assertReflectionEquals(expectedPerson, actualPerson);
    }

    @Test
    public void testObjectsFail() {
        Address expectedAddress = new Address("Barad-dûr", null, "Mordor", "1");
        Person expectedPerson = new Person("Sauron", null, expectedAddress);

        Address actualAddress = new Address("Barad-dûr", "Mount Doom", "Mordor", "1");
        Person actualPerson = new Person("Sauron", null, actualAddress);

        assertReflectionEquals(expectedPerson, actualPerson);
    }
}
