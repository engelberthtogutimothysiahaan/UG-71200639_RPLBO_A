package com.ug13.sakitrumah;

import java.sql.*;
import java.util.Scanner;

public class Pendaftaran{
    private int idPendattaran;
    private String nama;

    public Pendaftaran(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pengunjung pengunjung, Pemeriksa pemeriksa, Perawat perawat, Jadwal jadwal) throws SQLException {
        if(!pengunjung.getStatus()){
            jadwal.setPerawat(perawat);
            jadwal.setPengunjung(pengunjung);
            jadwal.setStatusDaftar(true);
            jadwal.setPendaftaran(this);

            int idPemeriksaan = jadwal.getIdPemeriksaan();

            int idPemeriksa = pemeriksa.getIdPemeriksa();
            int idPendaftaran = this.getIdPendaftaran();
            int status = 1;
            String url = "jdbc:mysql://localhost:3306/rumahsakit";
            try {

                Connection conn = DriverManager.getConnection(url,"root","");
                Statement statement = conn.createStatement();
                int rs = statement.executeUpdate("INSERT INTO jadwal values ('"+idPemeriksaan+"','"+idPemeriksa+"','"+idPendaftaran+"','"+status+"')");

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }

    public Pengunjung registrasi() throws SQLException {


        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String namaPengunjung = inp.nextLine();

        Scanner usia = new Scanner(System.in);
        System.out.print("Masukkan usia anda : ");
        int usiaPengunjung= inp.nextInt();

        Scanner inp2 = new Scanner(System.in);

        System.out.print("Masukkan alamat anda : ");
        String alamatPengunjung= inp2.nextLine();

        Scanner inp3 = new Scanner(System.in);
        System.out.print("Masukkan penyakit anda : ");
        String penyakitPengunjung = inp3.nextLine();

        Pengunjung pengunjung = new Pengunjung(namaPengunjung,usiaPengunjung,alamatPengunjung,penyakitPengunjung);
        System.out.println("Proses Registrasi Anda Berhasil!");
        return pengunjung;
    }


    public int getIdPendaftaran() {
        return idPendattaran;
    }

    public void setIdPendaftaran(int idPendaftaran) {
        this.idPendattaran = idPendaftaran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

