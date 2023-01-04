package com.uas.prakrplbo;

public class Cerberus extends Monster{

    public Cerberus(String nama) {
        super(nama);
    }

    @Override
    public String bersuara() {
        return "Rawrrawr";
    }

    @Override
    public String bergerak() {
        return super.getNama()+" Berlari...";
    }
}