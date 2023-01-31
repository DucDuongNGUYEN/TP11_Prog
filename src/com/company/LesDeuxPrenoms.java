package com.company;

public class LesDeuxPrenoms implements PrenomsUtilises{
    @Override
    public String parmi(String prenom1, String prenom2) {
        return prenom1 + " " + prenom2 ;
    }
}
