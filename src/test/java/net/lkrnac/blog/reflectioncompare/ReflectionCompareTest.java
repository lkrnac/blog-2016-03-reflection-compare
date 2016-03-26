package net.lkrnac.blog.reflectioncompare;

import org.junit.Test;
import org.unitils.reflectionassert.ReflectionComparatorMode;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

public class ReflectionCompareTest {
    @Test
    public void testCompareArraysFail() {
        String [] expectedArray = new String []{"string1", "string2", "string3"};
        String [] actualArray = new String []{"string1", "string3", "string2"};

        assertReflectionEquals(expectedArray, actualArray);
    }

    @Test
    public void testCompareArraysSuccess() {
        String [] expectedArray = new String []{"string1", "string2", "string3"};
        String [] actualArray = new String []{"string1", "string3", "string2"};

        assertReflectionEquals(expectedArray, actualArray, ReflectionComparatorMode.LENIENT_ORDER);
    }

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
