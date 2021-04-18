package com.HR.logic;

public class Dokument {
    private String Naziv, Putanja, Vlasnik, Tip;
    private int ID;

    public Dokument(int id, String naziv, String putanja, String tip, String vlasnik){
        ID = id;
        Naziv = naziv;
        Putanja = putanja;
        Tip = tip;
        Vlasnik = vlasnik;

    }
    public int getID(){return ID;}
    public String getNaziv(){return Naziv;}
    public String getPrezime(){return Putanja;}
    public String getTel(){return Tip;}
    public String getEmail(){return Vlasnik;}
}
