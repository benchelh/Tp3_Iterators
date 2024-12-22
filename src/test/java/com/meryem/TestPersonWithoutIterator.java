package com.meryem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class TestPersonWithoutIterator {

    @Test
    public void testRemoveWithoutIterator() {
        Set<person> people = new HashSet<>();
        people.add(new person(1, "meryem"));
        people.add(new person(2, "rania"));
        people.add(new person(3, "douae"));

        // Tentative de suppression sans itérateur, ce qui provoque une ConcurrentModificationException
        assertThrows(UnsupportedOperationException.class, () -> {
            for (person person : people) {
                if (person.getName().equals("rania")) {
                    people.remove(person); 
                }
            }
        });
    }
}
