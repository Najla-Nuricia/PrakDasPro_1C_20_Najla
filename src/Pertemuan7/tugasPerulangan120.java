package Pertemuan7;

import java.util.Scanner;

public class tugasPerulangan120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaTiket=50000, totalPenjualan=0, tiketDibeli, totalTiketDiskon=0, diskon=0;
        String namaPembeli; 

        do {
            System.out.print("masukkan nama pembeli: ");
            namaPembeli = sc.nextLine();
            if (namaPembeli.equalsIgnoreCase("selesai")) {
                System.out.println("transaksi hari ini selesai");
                break;
            } 
            System.out.print("masukkan jumlah tiket: ");
            tiketDibeli = sc.nextInt();
            if (tiketDibeli < 0) {
                System.out.print("masukkan jumlah tiket yang valid: ");
                tiketDibeli = sc.nextInt();
            }
            if (tiketDibeli > 4) {
                diskon = 0.1;
                totalTiketDiskon = (tiketDibeli*hargaTiket) - ((tiketDibeli*hargaTiket)*diskon);
                System.out.println("harga tiket: " + totalTiketDiskon);
            } else if (tiketDibeli > 10) {
                diskon = 0.15;
                totalTiketDiskon = (tiketDibeli*hargaTiket) - ((tiketDibeli*hargaTiket)*diskon);
                System.out.println("harga tiket: " + totalTiketDiskon);
            } else {
                System.out.println("tidak mendapat diskon");
                diskon=0;
                totalTiketDiskon = (tiketDibeli*hargaTiket) - ((tiketDibeli*hargaTiket)*diskon);
                System.out.println("harga tiket: " + totalTiketDiskon);
            }

            totalPenjualan += totalTiketDiskon;
            sc.nextLine();

        } while(true);
        System.out.println("total penjualan hari ini: " + totalPenjualan);
        sc.close();
    }
    
}
