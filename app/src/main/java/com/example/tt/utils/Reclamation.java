package com.example.tt.utils;

public class Reclamation {
    private String nom ;
    private  String prenom ;
    private  String adr ;
    private  String cp ;
    private  String  email ;
    private String tel ;
    private  String type ;
    private  String description ;

    public Reclamation(String nom, String prenom, String adr, String cp, String email, String tel, String type, String desc) {
        this.nom = nom;
        this.prenom = prenom;
        this.adr = adr;
        this.cp = cp;
        this.email = email;
        this.tel = tel;
        this.type = type;
        this.description = desc;
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

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
