package com.uas.prakrplbo;

public class Manticore extends Monster{

    public Manticore(String nama) {
        super(nama);
    }

    @Override
    public String bersuara() {
        return "Roarroar";
    }

    @Override
    public String bergerak() {
        return super.getNama()+" Terbang...";
    }
}
