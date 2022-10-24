package com.rplbo.utsnota;

public class Pulpen extends Barang {
    private String warna;

    Pulpen(String kodebarang, int harga, int berat, String deskripsi, String warna){
        super(kodebarang,harga,berat,deskripsi);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void getInformasi() {
        super.getInformasi();
        System.out.println(getWarna());
    }
}