package com.company;

public class Identite3 extends Identite{
    private OrdreIdentite ordre;
    private PrenomsUtilises prenoms;
    Identite3(String nom, String prenom1, String prenom2, OrdreIdentite ordre, PrenomsUtilises prenoms) {
        super(nom, prenom1, prenom2);
        this.ordre = ordre;
        this.prenoms = prenoms;
    }

    @Override
    String enonce() {
        return ordre.ordonne(prenoms.parmi(getPrenom1(),getPrenom2()),getNom());
    }
}
