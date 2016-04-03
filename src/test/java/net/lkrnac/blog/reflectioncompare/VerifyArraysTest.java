package net.lkrnac.blog.reflectioncompare;

import org.junit.Test;
import org.unitils.reflectionassert.ReflectionComparatorMode;

import static java.util.Arrays.asList;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

public class VerifyArraysTest {

    @Test
    public void testCompareArraysSuccess() {
        String [] expectedArray = new String []{"string1", "string2", "string3"};
        String [] actualArray = new String []{"string1", "string3", "string2"};

        assertReflectionEquals(expectedArray, actualArray, ReflectionComparatorMode.LENIENT_ORDER);
    }

    @Test
    public void testCompareArraysFail() {
        String [] expectedArray = new String []{"string1", "string2", "string3"};
        String [] actualArray = new String []{"string1", "string3", "string2"};

        assertReflectionEquals(expectedArray, actualArray);
    }

    @Test
    public void testCompareCollectionsSuccess() {
        String [] expectedArray = new String []{"string1", "string2", "string3"};
        String [] actualArray = new String []{"string1", "string3", "string2"};

        assertReflectionEquals(asList(expectedArray), asList(actualArray), ReflectionComparatorMode.LENIENT_ORDER);
    }

    @Test
    public void testCompareCollectionsFail() {
        String [] expectedArray = new String []{"string1", "string2", "string3"};
        String [] actualArray = new String []{"string1", "string3", "string2"};

        assertReflectionEquals(asList(expectedArray), asList(actualArray));
    }
}
