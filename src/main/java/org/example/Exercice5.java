package org.example;

import java.util.ArrayList;
import java.util.List;

public class Exercice5 {
    public static void main(String[] args) {
        List<Integer> nombres = new ArrayList<>();
        nombres.add(1);
        nombres.add(2);
        nombres.add(3);
        nombres.add(4);
        nombres.add(5);

        int resultat = 0;

        for (Integer nombre : nombres) {
            resultat = resultat + nombre ;
        }

        System.out.println(resultat);
        // Calculer la somme des nombres et la faire afficher, sans utiliser l'API des streams.
    }
}
