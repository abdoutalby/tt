package com.example.tt.utils;

public class Abonnement {

    private String sexe ;
    private String nom ;
    private String prenom  ;
    private String dn  ;
    private String adr ;
    private String emp ;
    private String vorigin ;
    private String vact ;
    private String codepostal  ;
    private String tel ;
    private String email ;
    private String numtt ;

    public Abonnement(String sexe,
                      String nom,
                      String prenom,
                      String dn, String adr,
                      String emp, String vorigin,
                      String vact, String codepostal,
                      String tel, String email,
                      String numtt) {
        this.sexe = sexe;
        this.nom = nom;
        this.prenom = prenom;
        this.dn = dn;
        this.adr = adr;
        this.emp = emp;
        this.vorigin = vorigin;
        this.vact = vact;
        this.codepostal = codepostal;
        this.tel = tel;
        this.email = email;
        this.numtt = numtt;
    }


    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
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

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public String getVorigin() {
        return vorigin;
    }

    public void setVorigin(String vorigin) {
        this.vorigin = vorigin;
    }

    public String getVact() {
        return vact;
    }

    public void setVact(String vact) {
        this.vact = vact;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumtt() {
        return numtt;
    }

    public void setNumtt(String numtt) {
        this.numtt = numtt;
    }
}
