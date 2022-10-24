package com.rplbo.utsnota;

public class Barang {
    private String deskripsi;
    private String kodebarang;
    private int harga;
    private int berat;

    public Barang(String kodebarang, int harga, int berat, String deskripsi){
        this.deskripsi = deskripsi;
        this.kodebarang = kodebarang;
        this.harga = harga;
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void getInformasi(){
        System.out.println("Kode Barang: "+getKodebarang());
        System.out.println("Harga: "+getHarga());
        System.out.println("Berat: "+getBerat());
        System.out.println("Deskripsi: "+getDeskripsi());
    }
}