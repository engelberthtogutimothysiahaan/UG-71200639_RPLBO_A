package com.ug11.kalkulasirupiah;

public class KalkulasiRupiah {

    static String kalkulasi(String kalimat){
        String[] temp = kalimat.split(" ");
        int hasil = 0;
        System.out.print("Rincian biaya: ");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].matches("[R&p]+[0-9]+[.][0-9]+[,][0-9]+")){
                System.out.print(temp[i] + " ");

            }
        }
        return " ";
    }

    public static void main(String[] args) {
        String teks ="Ibu membeli minyak goreng seharga Rp22.500,00 dan margarin seharga Rp12.500,00 di supermarket";
        System.out.println(kalkulasi(teks));
    }

}