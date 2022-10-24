package com.rplbo;

import java.util.Objects;

public class Perempuan {
    private String nama;
    private int usia;
    private String status;
    private Double jumlahCinta = 0.0;
    private Pria jodoh;
    private Pria temanKencan;
    private Double standarJumlahCinta;

    Perempuan(String nama, int usia, double standarJumlahCinta){
        this.nama = nama;
        this.usia = usia;
        this.standarJumlahCinta = standarJumlahCinta;
    }

    public void MengajakKencan(Pria pria){
        if(Objects.equals(this.temanKencan.getNama(), pria.getNama())){
            pria.setJumlahCinta(0.5);
            this.jumlahCinta += 0.5;
        }else {
            System.out.println("KAU JANGAN TIDAK SETIA, JANGAN KAU AJAK COWOK LAIN JALAN!!");
        }
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setJodoh(Pria jodoh) {
        this.jodoh = jodoh;
    }

    public void setJumlahCinta(Double jumlahCinta) {
        this.jumlahCinta += jumlahCinta;
    }

    public void setStandarJumlahCinta(Double standarJumlahCinta) {
        this.standarJumlahCinta = standarJumlahCinta;
    }

    public void setTemanKencan(Pria temanKencan) {
        this.temanKencan = temanKencan;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public int getUsia() {
        return usia;
    }

    public Double getJumlahCinta() {
        return jumlahCinta;
    }

    public Double getStandarJumlahCinta() {
        return standarJumlahCinta;
    }

    public Pria getJodoh() {
        return jodoh;
    }

    public Pria getTemanKencan() {
        return temanKencan;
    }
}