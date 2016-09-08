package seedu.addressbook.common;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {
    
    /*
     *  Tests isAnyNull method
     */
    @Test
    public void testIsAnyNull_noNull() {
        assertFalse(Utils.isAnyNull("abc"));
    }
    public void testIsAnyNull_nullGiven() {
        assertFalse(Utils.isAnyNull((Object) null));
    }
    @Test
    public void testIsAnyNull_someNull() {
        assertTrue(Utils.isAnyNull("String", 123, null));
    }
    @Test
    public void testIsAnyNull_empty() {
        assertFalse(Utils.isAnyNull());
    }
    
    /*
     * Tests elementsAreUnqiue
     */
    @Test
    public void testElementsAreUnique_allUniqueArrayList() {
        ArrayList<Integer> testAllUnique = new ArrayList<Integer>();
        testAllUnique.add(1);
        testAllUnique.add(2);
        testAllUnique.add(3);
        assertTrue(Utils.elementsAreUnique(testAllUnique));
    }
    @Test
    public void testElementsAreUnique_nonUniqueArrayList() {
        ArrayList<Integer> noUnique = new ArrayList<Integer>();
        noUnique.add(1); 
        noUnique.add(1); 
        noUnique.add(1);
        assertFalse(Utils.elementsAreUnique(noUnique));
    }
    @Test
    public void testElementsAreUnique_emptyArrayList() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        assertTrue(Utils.elementsAreUnique(empty));
    }
}