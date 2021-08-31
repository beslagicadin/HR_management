package com.HR.logic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Radnik {
    private int ID,Plata;
    private String Ime, Prezime, Tel, Email;
    private Resor resoR;
}
