package org.example;

import java.util.List;

public class Exercice6 {
    public static void main(String[] args) {
        List<Integer> nombres = List.of(1, 8, 2, 13, 5, 4);

        int nombreLePlusGrand = 0;

        for (Integer nombre : nombres) {
            if (nombre > nombreLePlusGrand) {
                nombreLePlusGrand = nombre;
            }
        }
        System.out.println(nombreLePlusGrand);

        // Extraire le nombre maximum parmi une liste de nombres et le faire afficher, sans utiliser l'API des streams.
    }
}
