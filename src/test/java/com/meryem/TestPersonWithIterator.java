package com.meryem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class TestPersonWithIterator {

    @Test
    public void testRemoveWithIterator() {
        Set<person> people = new HashSet<>();
        people.add(new person(1, "Meryem"));
        people.add(new person(2, "Rania"));
        people.add(new person(3, "Douae"));

        Iterator<person> iterator = people.iterator();
        while (iterator.hasNext()) {
            person person = iterator.next();
            if (person.getName().equals("Rania")) {
                iterator.remove(); // Suppression sécurisée
            }
        }

        // Vérification que Rania a été supprimée
        boolean raniaExists = false;
        for (person person : people) {
            if (person.getName().equals("Rania")) {
                raniaExists = true;
                break;
            }
        }
        assertFalse(raniaExists); // Rania ne doit plus être dans le set
    }
}
