package Pertemuan4;

import java.util.Scanner;

public class lamahari20 {
    public static void main(String[] args) {
        System.out.println("Nama  : Najla Nuricia Laudy");
        System.out.println("Nim   : 244107020091");
        System.out.println("Absen : 20");
        System.out.println("======== QUIZ 1 TI =========");

        Scanner sc = new Scanner(System.in);

        int tanggalBerangkat20, bulanBeragkat20, tahunBerangkat20, kalenderBerangkat20, lamaSE20, lamaSEtahun20, sisaHari20, tanggalKepulangan20, thBrktSetelah20, lamaSEBulan20;

        System.out.print("Masukkan tanggal berangkat: ");
        tanggalBerangkat20 = sc.nextInt();
        System.out.print("Masukkan Bulan berangkat: ");
        bulanBeragkat20 = sc.nextInt();
        System.out.print("Masukkan tahun berangkat: ");
        tahunBerangkat20 = sc.nextInt();

        System.out.println("tanggal berangkat: " + tanggalBerangkat20 + "-" + bulanBeragkat20 + "-" + tahunBerangkat20);
        System.out.println("========= Masukkan Lama anda Se ========");
        System.out.print("Masukkan lama hari exchane : ");

        lamaSE20 = sc.nextInt();
        lamaSEtahun20 = lamaSE20 / 365;
        thBrktSetelah20 = tahunBerangkat20 + lamaSEtahun20;

        System.out.println("lama SE dalam tahun: " + lamaSEtahun20 + " tahun");
        System.out.println("Tanggal kepulangan anda: " + tanggalBerangkat20 + "-" + bulanBeragkat20 + "-" + thBrktSetelah20 );
        
        













    }
}
