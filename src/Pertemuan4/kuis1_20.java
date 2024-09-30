package Pertemuan4;

import java.util.Scanner;

/**
 * kuis1_20
 */
public class kuis1_20 {

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

        int lamaHari20; 

        System.out.print("Masukkan lama hari Student Exchange: ");
        lamaHari20 = sc.nextInt();

        int lamaTahun20, sisaHari120, lamaBulan20, sisaHari220;

        lamaTahun20 = lamaHari20/360;
        sisaHari120 = lamaHari20%360;
        lamaBulan20 = sisaHari120/30;
        sisaHari220 = sisaHari120%30;

        int tanggalPUlang20, bulanTambah20, bulanPulang20, tahunTambah20, tahunPulang20;

        tanggalPUlang20 = (tanggalBerangkat20 + sisaHari220-1)%30+1;
        bulanTambah20 = (tanggalBerangkat20 + sisaHari220)/31;
        bulanPulang20 = (bulanBerangkat20 + lamaBulan20 + bulanTambah20-1)%12+1;
        tahunTambah20 = (bulanBerangkat20 + lamaBulan20 + bulanTambah20)/13;
        tahunPulang20 = (tahunBerangkat20 + lamaTahun20 + tahunTambah20);

        System.out.println("tanggal kepulangan anda: " + tanggalPUlang20 + "-" + bulanPulang20 + "-" + tahunPulang20);

        sc.close();
    }
}
