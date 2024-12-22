package com.meryem;

import java.util.HashSet;
import java.util.Set;

public class TestPersonWithoutIterator {
    public static void main(String[] args) {
        Set<person> people = new HashSet<>();
        people.add(new person(1, "meryem"));
        people.add(new person(2, "rania"));
        people.add(new person(3, "douae"));

        // Suppression sans iterator (provoque une ConcurrentModificationException)
        for (person person : people) {
            if (person.getName().equals("rania")) {
                people.remove(person); // Erreur ici
            }
        }
    }
}