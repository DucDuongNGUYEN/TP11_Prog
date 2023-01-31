package com.company;

abstract class Identite {
    private String nom;
    private String prenom1;
    private String prenom2;
    String getNom() { return nom; }
    String getPrenom1() { return prenom1; }
    String getPrenom2() { return prenom2; }
    Identite(String nom, String prenom1, String prenom2) {
        this.nom = nom;
        this.prenom1 = prenom1;
        this.prenom2 = prenom2;
    }
    abstract String enonce(); // Comment on ´enonce l’identit´e
}
