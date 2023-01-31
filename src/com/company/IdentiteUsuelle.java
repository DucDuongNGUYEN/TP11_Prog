package com.company;

public abstract class IdentiteUsuelle extends Identite2{
    IdentiteUsuelle(String nom, String prenom1, String prenom2) {
        super(nom, prenom1, prenom2);
    }
    @Override
    String misAvant() {
        return getPrenomsUtilises();
    }

    @Override
    String misApres() {
        return getNom();
    }
}
