package Pertemuan8;
import java.util.Scanner;
public class uts20 {
    public static void main(String[] args) {
        Scanner najla20 = new Scanner(System.in);

        int menu20, beratPky20 = 0, i=1, biaya20, diskon20=0, uangCust20, kembalian20, biayaDiskon20=0;
        String nama20, alamat20, noHp20, layanan20, kembalimMenu20, layananTambah20, cetak20;

        System.out.println("==UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1C=");
        System.out.println("dibuat oleh : Najla Nuricia Laudy ");
        System.out.println("NIM: 244107020091");
        System.out.println("=================================");
        System.out.println("pilih menu ");
        System.out.println("1. Data Customer ");
        System.out.println("2. biaya laundry");
        najla20.nextLine();


       while (i == 1) {
        System.out.print("pilih menu ");
        menu20 = najla20.nextInt();
        najla20.nextLine();
        if (menu20 == 2) {
            System.out.println("masukkan data customer terlebih dahulu");
            System.out.print("kembali ke menu(y/t): ");
            kembalimMenu20 = najla20.nextLine();
            if (kembalimMenu20.equalsIgnoreCase("y")) {
                continue;
            }
       } else if (menu20 ==1) {
        System.out.println("masukkan data customer ");
        System.out.print("nama: ");
        nama20 = najla20.nextLine();
        System.out.print("alamat: ");
        alamat20 = najla20.nextLine();
        System.out.print("no hp: ");
        noHp20 = najla20.nextLine();
        System.out.print("jenis layanan (1. cuci kering 2. cuci kering setrika 3. setrika sj): ");
        layanan20=najla20.nextLine();
        System.out.print("layanan tambahan (1. express 2. biasa ): ");
        layananTambah20=najla20.nextLine();
        System.out.print("berat pakaian (kg): ");
        beratPky20=najla20.nextInt();
        najla20.nextLine();

        System.out.println("apakah ingin mencetak data customer?(y/t):");
        cetak20=najla20.nextLine();
        if (cetak20.equalsIgnoreCase("y")) {
            System.out.println("============================");
            System.out.println("DATA CUSTOMER");
            System.out.println("============================");
            System.out.println("nama : " + nama20);
            System.out.println("alamat : " + alamat20);
            System.out.println("no hp : " + noHp20);
            System.out.println("layanan : " + layanan20);
            System.out.println("layanan tambahan : " + layananTambah20);
            System.out.println("berat pakaian : " + beratPky20);

            System.out.println("pilih menu ");
            System.out.println("1. Data Customer ");
            System.out.println("2. biaya laundry");
            menu20 = najla20.nextInt();
            if (menu20 == 2) {
                if (layananTambah20 == "1") {
                    if (layanan20 == "1") {
                        biaya20 = (beratPky20*4000) + 10000;
                    } else if (layanan20 == "2") {
                        biaya20 = (beratPky20*5000) + 10000;
                    } else {
                        biaya20 = (beratPky20*3500) + 10000;
                    } 
                    System.out.println("total bayar : "+ biaya20) ;
                } else {
                    if (layanan20 == "1") {
                        biaya20 = beratPky20*4000;
                    } else if (layanan20 == "2") {
                        biaya20 = beratPky20*5000;
                    } else {
                        biaya20 = beratPky20*3500;
                    }
                    System.out.println(" total bayar : " + biaya20);
                } 
                if (beratPky20 > 10) {
                    diskon20 = 10/100;
                    biayaDiskon20 = biaya20 - (biaya20*diskon20);
                    System.out.println("diskon : 10%");
                    if (beratPky20>15) {
                        diskon20 = 20/100;
                        diskon20 = biaya20*diskon20;
                        biayaDiskon20 = biaya20- (biaya20*diskon20);
                    } else {
                        diskon20 = 0;
                        diskon20 = biaya20*diskon20;
                        biayaDiskon20 = biaya20- (biaya20*diskon20);
                    }
                } else {
                    diskon20 = 0;
                    diskon20 = biaya20*diskon20;
                    biayaDiskon20 = biaya20- (biaya20*diskon20);
                } 
               
                System.out.println("=========================");
                System.out.println("detail pembayaran");
                System.out.println("=========================");
                System.out.println("nama : " + nama20);
                System.out.println("biaya sebelum diskon" + biaya20);
                 System.out.println("biaya setelah diskon: " + biayaDiskon20);
                 System.out.println("diskon: " + diskon20);
                 System.out.println("pembayaran yg harus dilakukan: " + biayaDiskon20);
                 System.out.println("masukkan jumlah uang: ");
                 uangCust20 = najla20.nextInt();
                 kembalian20 = uangCust20 - biaya20; 
                 System.out.println("kembalian: " + kembalian20); 

                 System.out.println("kembali ke menu(y/t): ");
                 kembalimMenu20 = najla20.nextLine();
                 if (kembalimMenu20.equalsIgnoreCase("y")) {
                     continue;        
            }
        } else {
           continue;  
        }

       }
       najla20.close();


    }
    
}}}
