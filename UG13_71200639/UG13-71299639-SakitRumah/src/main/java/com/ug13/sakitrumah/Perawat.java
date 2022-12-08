package com.ug13.sakitrumah;

public class Perawat {
    private int idPerawat;
    private String nama;

    public Perawat(String nama){
        this.nama = nama;
    }

    public void screening(Pengunjung pengunjung,Jadwal jadwal){
        if (jadwal.getPengunjung().equals(this)){
            if(jadwal.getPengunjung().equals(pengunjung) && jadwal.getStatusDaftar()){
                jadwal.setStatusScreening(true);
                System.out.println("Screening berhasil");
            }else {
                System.out.println(
                        "====================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN " +
                                "TERLEBIH DAHULU DI BAGIAN PELAYAN===================="
                );
            }
        }else {
            System.out.println("EROR !!");
        }
    }

    public int getIdPerawat() {
        return idPerawat;
    }

    public void setIdPerawat(int idPerawat) {
        this.idPerawat = idPerawat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

