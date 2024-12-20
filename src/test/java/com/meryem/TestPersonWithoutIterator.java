package com.meryem;

import java.util.HashSet;
import java.util.Set;

public class TestPersonWithoutIterator {
    public static void main(String[] args) {
        Set<person> people = new HashSet<>();
        people.add(new person(1, "Alice"));
        people.add(new person(2, "Bob"));
        people.add(new person(3, "Charlie"));

        // Suppression sans iterator (provoque une ConcurrentModificationException)
        for (person person : people) {
            if (person.getName().equals("Bob")) {
                people.remove(person); // Erreur ici
            }
        }
    }
}