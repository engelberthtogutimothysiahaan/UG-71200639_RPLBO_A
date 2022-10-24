package com.rplbo.tocm;

public class Main_71200639 {
    public static double FeetIncToCm(int inc){
        double hasil;
        if(inc > 0){
            double inch = inc % 12;
            double feet = (inc - inch)/12;
            hasil = FeetIncToCm(feet,inch);
            System.out.println(inc+" inc = "+feet+" feet "+inch+" inc");
            return hasil;
        }
        else {
            return -1;
        }
    }
    public static double FeetIncToCm(double feet, double inch){
        if(feet > 0 && inch > 0){
            double f = feet * 12;
            double hasil = (f + inch)*2.54;
            return hasil;
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Nilai dalam centimeter: "+FeetIncToCm(1,3)+" cm");
        System.out.println("Nilai dalam centimeter: "+FeetIncToCm(15)+" cm");
        System.out.println();
        System.out.println("Nilai dalam centimeter: "+FeetIncToCm(12,5)+" cm");
        System.out.println("Nilai dalam centimeter: "+FeetIncToCm(30)+" cm");
    }
}