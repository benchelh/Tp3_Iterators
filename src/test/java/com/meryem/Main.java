package com.meryem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> nombresPairs = new ArrayList<>();

        // Filtrer les nombres pairs
        for (Integer nombre : nombres) {
            if (nombre % 2 == 0) {
                nombresPairs.add(nombre);
            }
        }

        // Afficher les nombres pairs
        System.out.println("Nombres pairs : " + nombresPairs);
    }
}