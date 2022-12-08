package com.ug13.sakitrumah;

public class Pemeriksa {
    private int idPemeriksa;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung,Jadwal jadwal){
        if(jadwal.getStatusScreening() && jadwal.getPemeriksa().equals(this)){
            if(pengunjung.getLevelPenyakit() == 0){
                pengunjung.setStatus(true);
            }else {
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit()-1);
            }
        }else {
            System.out.println(
                    "====================ANDA HARUS MELAKUKAN PROSES PENDAFTARAN " +
                            "TERLEBIH DAHULU DI BAGIAN PELAYAN===================="
            );
        }
    }

    public void cekStatus(Pengunjung pengunjung, Jadwal jadwal){
        if (pengunjung.getStatus()){
            System.out.println("================SELAMAT PENGUNJUNG ANDA SUDAH SEMBUH DAN SEHAT================");
        }else {
            System.out.println("================PENGUNJUNG ANDA MASIH SAKIT================");
        }
    }

    public int getIdPemeriksa() {
        return idPemeriksa;
    }

    public void setIdPemeriksa(int idPemeriksa) {
        this.idPemeriksa = idPemeriksa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }
}

