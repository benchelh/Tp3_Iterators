package com.meryem;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPersonWithIterator {
    public static void main(String[] args) {
        Set<person> people = new HashSet<>();
        people.add(new person(1, "Alice"));
        people.add(new person(2, "Bob"));
        people.add(new person(3, "Charlie"));

        // Suppression avec iterator (sécurisé)
        Iterator<person> iterator = people.iterator();
        while (iterator.hasNext()) {
            person person = iterator.next();
            if (person.getName().equals("Bob")) {
                iterator.remove(); // Suppression sécurisée
            }
        }

        System.out.println("Set après suppression de 'Bob' : " + people);
    }
}