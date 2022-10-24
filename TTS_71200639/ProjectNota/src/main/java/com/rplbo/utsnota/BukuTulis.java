package com.rplbo.utsnota;

public class BukuTulis extends Barang{
    public String merk;

    BukuTulis(String kodebarang, int harga, int berat, String deskripsi,String merk){
        super(kodebarang,harga,berat,deskripsi);
        this.merk = merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }

    @Override
    public void getInformasi() {
        super.getInformasi();
        System.out.println("Merk : "+getMerk());
    }
}