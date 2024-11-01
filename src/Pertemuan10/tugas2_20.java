package Pertemuan10;

import java.util.Scanner;

public class tugas2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("masukkan Jumlah pesanan: ");
         int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jmlPesanan];
        int[] harga = new int[jmlPesanan];
        int total=0;



        for (int i=0; i<pesanan.length;i++) {
            System.out.print("masukkan nama makanan / minuman : "); 
            pesanan[i] = sc.nextLine();
        } 

        for ( int i = 0; i<pesanan.length;i++) {
            System.out.print("masukkan harga untuk menu " + pesanan[i]+ " : ");
            harga[i] = sc.nextInt(); 

            total += harga[i];
        } 

        System.out.println("=======Daftar Harga & Total Bayar========");

        for (int i = 0;i<pesanan.length; i++) {
            System.out.println((i+1)+"."+ " " + pesanan[i] + " : " + harga[i]); 
        } 

        System.out.println("total : " + total);
        sc.close();
    }
    
}
