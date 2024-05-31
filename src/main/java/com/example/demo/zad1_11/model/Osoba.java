package com.example.demo.zad1_11.model;

public class Osoba {

    private Integer id;
    private String imie;
    private String nazwisko;
    private String telefon;
    private String mail;
    private Integer wiek;
    public Osoba(Integer id, String imie, String nazwisko, String telefon, String mail, Integer wiek) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.mail = mail;
        this.wiek = wiek;
    }



    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", telefon='" + telefon + '\'' +
                ", mail='" + mail + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}


