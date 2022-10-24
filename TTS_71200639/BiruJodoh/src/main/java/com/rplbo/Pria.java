package com.rplbo;

import java.util.Objects;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private Double jumlahCinta = 0.0;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    Pria(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }
    public void PDKT(Perempuan calon){
        if(!Objects.equals(status, "Pacaran")){
            this.temanKencan = calon;
        }else {
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG");
        }
    }
    public void MengajakKencan(Perempuan perempuan){
        if(Objects.equals(this.temanKencan.getNama(), perempuan.getNama())){
            perempuan.setJumlahCinta(1.0);
            this.jumlahCinta += 1.0;
        }else {
            System.out.println("KAU JANGAN TIDAK SETIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!");
        }
    }
    public void MenembakKekasih(){
        if(this.temanKencan != null && jumlahCinta >= temanKencan.getStandarJumlahCinta()){
            this.jodoh = temanKencan;
            setStatus("Pacaran");
            System.out.println("SELAMAT KAMU DITERIMA :D | SELAMAT MENJALANI HIDUP BARU "+getNama());
        }else {
            System.out.println("SIAPA YANG MAU KAU TEMBAK :') | JANGAN NGAYAL DEH "+getNama()+" !!!");
        }
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }

    public void setJumlahCinta(Double jumlahCinta) {
        this.jumlahCinta += jumlahCinta;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getJumlahCinta() {
        return jumlahCinta;
    }

    public int getUsia() {
        return usia;
    }

    public String getStatus() {
        return status;
    }

    public String getNama() {
        return nama;
    }

    public Perempuan getJodoh() {
        return jodoh;
    }

    public Perempuan getTemanKencan() {
        return temanKencan;
    }
}
