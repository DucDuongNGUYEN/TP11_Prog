package com.company;

public class IdentiteCourte extends Identite {
    IdentiteCourte(String nom, String prenom1, String prenom2) {
        super(nom, prenom1, prenom2);
    }

    @Override
    String enonce() {
        return super.getPrenom1() + " " + super.getNom();
    }
}
