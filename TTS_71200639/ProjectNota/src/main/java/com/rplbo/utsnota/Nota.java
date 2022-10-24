package com.rplbo.utsnota;
import java.time.LocalDateTime;

public class Nota {
    private String nonota;
    private String notelppembeli;
    private Item items;
    private String namapembeli;

    Nota(String nonota, String namapembeli, String notelppembeli, Item items){
        this.nonota = nonota;
        this.namapembeli = namapembeli;
        this.notelppembeli = notelppembeli;
        this.items = items;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }

    public void setNotelppembeli(String notelppembeli) {
        this.notelppembeli = notelppembeli;
    }

    public Item getItems() {
        return items;
    }

    public String getNamapembeli() {
        return namapembeli;
    }

    public String getNonota() {
        return nonota;
    }

    public String getNotelppembeli() {
        return notelppembeli;
    }
    public void tampilNota(){
        LocalDateTime tanggal = LocalDateTime.now();
        System.out.println("NOTA PEMBELIAN");
        System.out.println("No Nota: "+getNonota());
        System.out.println("Nama Pembeli: "+getNamapembeli());
        System.out.println("Telp Pembeli: "+getNotelppembeli());
        System.out.println("Tgl: "+LocalDateTime.now());
    }
    public int hitungTotalBayar(){
        Pulpen[] harga1 = items.getPen();
        return 0;
    }
}