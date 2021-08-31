package com.HR.logic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dokument {
    private int ID;
    private String Naziv, Putanja, Vlasnik, Tip;
}
