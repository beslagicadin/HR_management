package com.HR.logic;

public class Radnik {
    private String Ime, Prezime, Tel, Email;
    private int ID,Plata;
    private Resor resoR;

    public Radnik(int id, String ime, String prezime, String tel, String email, Resor resor, int plata){
            ID = id;
            Ime = ime;
            Prezime = prezime;
            Tel = tel;
            Email = email;
            Plata = plata;
            resoR = resor;
    }
    public int getID(){return ID;}
    public String getIme(){return Ime;}
    public String getPrezime(){return Prezime;}
    public String getTel(){return Tel;}
    public String getEmail(){return Email;}
    public Resor getResor(){return resoR;}
    public int getPlata(){return Plata;}
}
