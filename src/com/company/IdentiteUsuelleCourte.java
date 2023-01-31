package com.company;

public class IdentiteUsuelleCourte extends IdentiteUsuelle{
    IdentiteUsuelleCourte(String nom, String prenom1, String prenom2) {
        super(nom, prenom1, prenom2);
    }

    @Override
    String getPrenomsUtilises() {
        return super.getPrenom1();
    }
}
