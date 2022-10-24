package com.rplbo.utsnota;

public class Item {
    private KertasHVS[] krhvs;
    private BukuTulis[] bktulis;
    private Pulpen[] pen;

    Item(KertasHVS[] kertas){
        krhvs = kertas;
    }
    Item(BukuTulis[] buku){
        bktulis = buku;
    }
    Item(Pulpen[] pulpen){
        pen = pulpen;
    }
    Item(BukuTulis[] buku,Pulpen[] pulpen){
        bktulis = buku;
        pen = pulpen;
    }
    Item(KertasHVS[] kertas,Pulpen[] pulpen){
        krhvs = kertas;
        pen = pulpen;
    }
    Item(BukuTulis[] buku,KertasHVS[] kertas){
        bktulis = buku;
        kertas = kertas;
    }
    Item(BukuTulis[] buku,KertasHVS[] kertas,Pulpen[] pulpen){
        bktulis = buku;
        krhvs = kertas;
        pen = pulpen;
    }

    public BukuTulis[] getBktulis() {
        return bktulis;
    }

    public KertasHVS[] getKrhvs() {
        return krhvs;
    }

    public Pulpen[] getPen() {
        return pen;
    }
    public int getJumlahBukuTulis(){
        int hitung = 0;
        for (int i = 0; i<bktulis.length;i++){
            hitung += 1;
        }
        return hitung;
    }
    public int getJumlahPen(){
        int hitung = 0;
        for (int i = 0; i<pen.length;i++){
            hitung += 1;
        }
        return hitung;
    }
    public int getJumlahKertasHVS(){
        int hitung = 0;
        for (int i = 0; i<krhvs.length;i++){
            hitung += 1;
        }
        return hitung;
    }
}