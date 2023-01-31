package com.company;

public class OrdreNomPrenoms implements OrdreIdentite{
    @Override
    public String ordonne(String prenomsUtilises, String nom) {
        return nom +" "+ prenomsUtilises;
    }
}
