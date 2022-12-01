package com.ug12.projectkassa;
import java.util.HashMap;
import java.util.ArrayList;

public class Kassa {
    private HashMap<Produk,Integer> pesanan = new HashMap<Produk, Integer>();
    private ArrayList<Kasir> arrKasir = new ArrayList<Kasir>();
    private Kasir kasir;

    public void login(String username, String password){
        for (int i = 0; i < arrKasir.size(); i++){
            if (arrKasir.get(i).getUsername().equals(username) && arrKasir.get(i).getPassword().equals(password)){
                System.out.println("Login berhasil!");
                break;
            }else{
                System.out.println("Username/password Anda salah!");
            }
        }
    }

    public void register(Kasir kasir){
        this.arrKasir.add(kasir);
        System.out.println("Kasir "+kasir.getNama()+" berhasil ditambahkan ke dalam sistem");
    }

    public void tambahPesanan(Produk produk,int jumlah){
        this.pesanan.put(produk,jumlah);
    }

    public void printNota(){
        System.out.println("==========Nota==========");
    }

    public void printPenjualanKasir(){
        System.out.println("Daftar Kasir:");
    }
}