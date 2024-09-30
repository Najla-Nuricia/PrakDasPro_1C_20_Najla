package Pertemuan5;


import java.util.Scanner;

public class CopyKafe20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100f;

        System.out.print("Masukkan Keanggotaan (true/false): ");
        keanggotaan = input.nextLine();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt(); 

        switch (keanggotaan.toLowerCase()) {
            case "true":
            totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
            nominalBayar = totalHarga - (diskon * totalHarga);
            System.out.println("total harga: " + totalHarga);
            System.out.println("nominal bayar: " + nominalBayar);
            System.out.println("anda mendapat diskon");
                break;
        
            default:
            totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
            System.out.println("Nominal bayar: " + totalHarga);
            System.out.println("Anda tidak mendapat diskon");
                break;
        }
        input.close(); 
    }
}
