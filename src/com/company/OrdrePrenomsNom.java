package com.company;

public class OrdrePrenomsNom implements OrdreIdentite{
    @Override
    public String ordonne(String prenomsUtilises, String nom) {
        return prenomsUtilises + " " + nom;
    }
}
