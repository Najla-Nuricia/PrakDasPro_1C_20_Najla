package Pertemuan4;

import java.util.Scanner;

public class kuis1_no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int tanggalBerangkat20, bulanBerangkat20, tahunBerangkat20;

        System.out.print("Masukkan tanggal Berangkat: ");
        tanggalBerangkat20 = sc.nextInt();
        System.out.print("Masukkan bulan Berangkat: ");
        bulanBerangkat20 = sc.nextInt();
        System.out.print("Masukkan tahun beragkat: ");
        tahunBerangkat20 = sc.nextInt();

        System.out.println("Tanggal berangkat: " + tanggalBerangkat20 + "-" + bulanBerangkat20 + "-" + tahunBerangkat20 );

        int tanggalPulang20, bulanPulang20, tahunPulang20; 

        System.out.print("Masukkan tanggal pulang: ");
        tanggalPulang20 = sc.nextInt();
        System.out.print("Masukkan bulan pulang: ");
        bulanPulang20 = sc.nextInt();
        System.out.print("masukkan tahun pulang: ");
        tahunPulang20 = sc.nextInt(); 

        System.out.println("Tanggal kepulangan anda: " + tanggalPulang20 + "-" + bulanPulang20 + "-" + tahunPulang20);

        int lamaHari20;

        lamaHari20 = ((tahunPulang20*360) + (bulanPulang20*30) + (tanggalPulang20)) - ((tahunBerangkat20*360)+ (bulanBerangkat20*30) + (tanggalPulang20) );

        System.out.print("Lama hari anda Student Exchange: " + lamaHari20);

        sc.close();


    }
}
