package Pertemuan7;

import java.util.Scanner;

public class kafeDoWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi=12000, teh=7000, roti=20000, jmlKopi, jmlTeh, jmlRoti;
        String namaPelanggan;

        do { 
            System.out.print("masukkan nama pelanggan: ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi batal");
                break;
            }
            System.out.print("jumlah kopi: ");
            jmlKopi = sc.nextInt();
            System.out.print("jumlah teh: ");
            jmlTeh = sc.nextInt();
            System.out.print("jumlah roti: ");
            jmlRoti = sc.nextInt();
    
            int totalHarga = (kopi*jmlKopi) + (teh*jmlTeh) + (roti*jmlRoti);
            System.out.println("total yang harus dibayar: " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai: ");
        sc.close();
    }   
}
