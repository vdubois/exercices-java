package org.example;

public class Exercice3 {
    public static void main(String[] args) {
        Integer age = 55;

        if (age < 12) {
            System.out.println("Enfant");
        } else if (age >= 12 && age <=17) {
            System.out.println("Adolescent");
        } else {
        System.out.println("Adulte");
        }

        // Si la variable age est inférieure à 12, afficher 'Enfant'
        // Si la variable age est comprise entre 12 et 17, afficher 'Adolescent'
        // Si la variable age est supérieure ou égale à 18, afficher 'Adulte'
    }
}
