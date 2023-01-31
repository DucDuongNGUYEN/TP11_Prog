package com.company;
public abstract class IdentiteAdministrative extends Identite2{
    IdentiteAdministrative(String nom, String prenom1, String prenom2) {
        super(nom, prenom1, prenom2);
    }

    @Override
    String misAvant() {
        return getNom();
    }

    @Override
    String misApres() {
        return getPrenomsUtilises();
    }
}

