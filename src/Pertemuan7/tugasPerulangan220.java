package Pertemuan7;

import java.util.Scanner;

public class tugasPerulangan220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("___________________________");
        System.out.println("------JENIS KENDARAAN------");
        System.out.println("___________________________");
        System.out.println("0. keluar");
        System.out.println("1. mobil");
        System.out.println("2. motor");
        System.out.println("___________________________");


        int jenis, total=0, durasi=0;
        do {
            System.out.print("masukkan jenis kendaraan: ");
            jenis = sc.nextInt();

            if (jenis==1 || jenis ==2) {
                System.out.print("masukkan durasi: ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total +=12500;
                } if (jenis == 1) {
                    total+=durasi*3000;
                } if (jenis==2) {
                    total += durasi*2000;
                }
                System.out.println("total biaya parkir anda: " + total);

            } else {
                break;
            }
            
        } while (jenis != 0);

        System.out.println("total pembayaran parkir anda" + total);
        sc.close();
    }
    
}
