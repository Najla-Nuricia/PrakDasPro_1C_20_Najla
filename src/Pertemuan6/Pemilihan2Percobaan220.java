package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan220 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        int pilihanMenu;
        double diskon, totalBayar=0, harga=0;
        boolean member, qris;

        System.out.println("---------------");
        System.out.println("-Menu kafe JTI-");
        System.out.println("---------------");
        System.out.println("1. rice bowl");
        System.out.println("2. ice tea");
        System.out.println("3. paket bundling (ricebowl + ice tea)");
        System.out.println("------------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih: ");
        pilihanMenu = sc20.nextInt();
        System.out.print("apakah punya member (true / false): ");
        member = sc20.nextBoolean(); 
        System.out.print("apakah pembayan menggunakan qris (true/false): ");
        qris = sc20.nextBoolean();
        

        if (member == true) {
            diskon = 0.1;
            System.out.println("diskon 10%");
            if (pilihanMenu == 1) {
                harga = 12000;
                System.out.println("harga ricebowl: " + harga);
            } else if (pilihanMenu ==2) {
                harga = 7000;
                System.out.println("harga ice tea: " + harga );
            } else if (pilihanMenu == 3) {
                harga = 20000;
                System.out.println("harga bundling: " + harga);
            } else {
                System.out.println("masukkan pilihan menu dgn benar");
                return; 
            }

            totalBayar = harga - (harga*diskon);

            if (qris == true) {
                totalBayar = totalBayar - 1000;
            } else {
                totalBayar = harga - (harga*diskon);
            }

            System.out.println("total harga: " + harga);
            System.out.println("total bayar: " + totalBayar);
            
        }  else {
            System.out.println("tidak mendapatkan diskon"); 
            if (pilihanMenu==1) {
                harga = 12000;
                System.out.println("harga ricebowl: " + harga);
            } else if (pilihanMenu==2) {
                harga = 7000;
                System.out.println("harga ice tea: " + harga);
            } else if (pilihanMenu==3) {
                harga = 20000;
                System.out.println("harga bundling: " + harga);
            } else {
                System.out.println("masukkan pilihan menu dengan benar");
                return;
            }

            if (qris == true) {
                totalBayar = harga - 1000;
            } else {
                totalBayar = harga;
            }
            System.out.println("total harga: " + harga);
            System.out.println("total bayar: " + totalBayar);
        } 

        sc20.close();
    }
    
}
