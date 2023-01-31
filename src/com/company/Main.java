package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        IdentiteCourte id1 = new IdentiteCourte("Dupont", "Charles", "Robert");
        System.out.println(id1.enonce()); // affiche : Charles Dupont
        IdentiteLongue id2 = new IdentiteLongue("Dupont", "Charles", "Robert");
        System.out.println(id2.enonce()); // affiche : Charles Robert Dupont

        Identite3 id1 = new Identite3("Dupont", "Charles", "Robert", new OrdrePrenomsNom(),
                new LesDeuxPrenoms());
        System.out.println(id1.enonce()); // affiche : Charles Robert Dupont
        Identite3 id2 = new Identite3("Dupont", "Charles", "Robert", new OrdreNomPrenoms(),
                new UnSeulPrenom());
        System.out.println(id2.enonce()); // affiche : Dupont Charles

         */
        Identite4 id1 = new Identite4("Dupont", "Charles", "Robert");
        Identite4 id2 = new Identite4("Carpentier", "Michel", "Henri");
        System.out.println(id1.enonce()); // affiche : Charles Dupont
        System.out.println(id2.enonce()); // affiche : Michel Carpentier
        Identite4.setOrdreIdentite(new OrdreNomPrenoms());
        System.out.println(id1.enonce()); // affiche : Dupont Charles
        System.out.println(id2.enonce()); // affiche : Carpentier Michel
        Identite4.setPrenomsUtilises(new LesDeuxPrenoms());
        System.out.println(id1.enonce()); // affiche : Dupont Charles Robert
        System.out.println(id2.enonce()); // affiche : Carpentier Michel Henri
    }
    //Question 6 : ocp respecté
    //SRP dans identite2 est violé (2 responsabilités : affichage et ordre). En règle ce problème en créant l'interface OrdreIdentite
}
