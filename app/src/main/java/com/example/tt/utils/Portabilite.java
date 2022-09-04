package com.example.tt.utils;

public class Portabilite {

    private String nom ;
    private  String prenom ;
    private  String adr ;
    private  String  email ;
    private String operateur ;
    private String tel ;

    public Portabilite(String nom,
                       String prenom,
                       String adr,
                       String email,
                       String operateur,
                       String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.adr = adr;
        this.email = email;
        this.operateur = operateur;
        this.tel = tel;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
