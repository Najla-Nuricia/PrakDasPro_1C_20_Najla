package Pertemuan6;

import java.util.Scanner;

public class Pertemuan6Tugas2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        String jenisBuku, hari;
        int jumlahBuku, diskon=0;

        System.out.print("masukkan hari: ");
        hari = sc20.nextLine();
        System.out.print("masukkan jenis buku: ");
        jenisBuku = sc20.nextLine();
        System.out.print("masukkan jumlah buku yang dibeli: ");
        jumlahBuku = sc20.nextInt();

        if (hari.equalsIgnoreCase("rabu")) {
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                if (jumlahBuku >=1 ) 
                    diskon = 10;
                    if (jumlahBuku > 2) {
                    diskon = diskon + 2; 
                } else {
                    diskon = diskon + 0;
                }

            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                if (jumlahBuku >= 1)
                    diskon = 7;
                        if (jumlahBuku <3 || jumlahBuku == 3) {
                        diskon += 1;
                } else {
                    diskon += 2;
                }

            } else {
                if (jumlahBuku >=1 && jumlahBuku >3 ) {
                    diskon = 5; 
                } else {
                    System.out.println("tidak mendapat diskon");
                }
            }
        } else {
            System.out.println("tidak mendapat diskon");
        }

        System.out.println("jumlah diskon: " + diskon + "%");
        sc20.close();
    }
    
}
