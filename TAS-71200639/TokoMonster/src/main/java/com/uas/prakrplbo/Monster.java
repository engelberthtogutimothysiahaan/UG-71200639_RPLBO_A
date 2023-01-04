package com.uas.prakrplbo;

public abstract class Monster implements MonsterInterface{
    private String nama;
    public Monster(String nama){
        this.nama = nama;
    }

    public abstract String bersuara();
    public void getInfo(){
        System.out.println("Nama: "+getNama());
        System.out.println("Suara: "+bersuara());
        System.out.println("Gerak: "+bergerak());
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
