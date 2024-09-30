package Pertemuan5;

import java.util.Scanner;

public class CopySiakad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas = sc.nextDouble(); 

        nilaiAkhir = (nilaiKuis * 20 / 100 ) + (nilaiTugas * 15 / 100) + (nilaiUts * 30 / 100) + (nilaiUas * 35 / 100);

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        sc.close(); 
        
        if (nilaiAkhir >80 && nilaiAkhir <=100) {
            System.out.println("Nilai Akhir huruf : A");
            System.out.println("Kualifikasi : sangat baik");
        } else if (nilaiAkhir >73 && nilaiAkhir <=80) {
            System.out.println("Nilai akhir huruf : B+");
            System.out.println("Kualifiksi : lebih dari baik");
        } else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            System.out.println("Nilai Akhir huruf : B");
            System.out.println("Kualifikasi : baik");
        } else if ( nilaiAkhir >60 && nilaiAkhir <=65) {
            System.out.println("Nilai Akhir huruf : C+ ");
            System.out.println("Kualifikasi : lebih dari cukup");
        } else if (nilaiAkhir >50 && nilaiAkhir <=60) {
            System.out.println("Nilai Akhir huruf : C");
            System.out.println("Kualifikasi : cukup");
        } else if (nilaiAkhir >39 && nilaiAkhir <=50) {
            System.out.println("Nilai Akhir huruf : D");
            System.out.println("Kualifikasi : Kurang");
        } else {
            System.out.println("Nilai Akhir huruf : E");
            System.out.println("Kualifikasi : gagal");
        }
    }
}
