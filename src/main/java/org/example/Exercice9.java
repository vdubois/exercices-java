package org.example;

import java.util.List;

public class Exercice9 {
    public static void main(String[] args) {
        List<Integer> nombres = List.of(1, 8, 2, 13, 5, 4);

        System.out.println(anyMatch(nombres, 8));
        System.out.println(anyMatch(nombres, 9));
    }

    /**
     * Retourne true si nombre fait partie de la liste des nombres fournie en paramètre, false sinon
     * Cette méthode n'utilise pas l'API des streams
     */
    public static boolean anyMatch(List<Integer> nombres, Integer nombre) {
        // Coder ici
        return false;
    }
}
