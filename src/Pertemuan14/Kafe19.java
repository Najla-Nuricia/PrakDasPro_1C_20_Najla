package Pertemuan14;
import java.util.Scanner;
public class Kafe19 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Menu("andi" , false);
        System.out.print("\nmasukkan nomor menu yang ingin anda pesan : ");
        int pilihanMenu = sc.nextInt();
        System.out.print("masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();
        System.out.print("masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        double totalHarga = hitungTotalHarga19(pilihanMenu, banyakItem, kodePromo);
        System.out.println("total harga untuk pesanan anda: Rp. " + totalHarga);
    }
    

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("selamat datang, " + namaPelanggan + " !");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. kopi hitam - Rp. 15.0000");
        System.out.println("2. cappuccino - Rp. 20.000");
        System.out.println("3. latte - Rp. 22.000");
        System.out.println("4. teh tarik - Rp. 12.000");
        System.out.println("5. roti bakar - Rp. 10.000");
        System.out.println("6. mie goreng - Rp. 18.000");
        System.out.println("=========================");
        System.out.println("silahkan pilih menu yang anda inginkan.");
    }

    public static double hitungTotalHarga19(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        double hargaTotal = hargaItems[pilihanMenu-1]* banyakItem;
        if (kodePromo.equals("DISKON50")) {
            System.out.println("selamat anda mendapatkan diskon 50%");
            hargaTotal = hargaTotal - (hargaTotal*0.5);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("selamat anda mendapatkan diskon 30%");
            hargaTotal = hargaTotal - (hargaTotal*0.3);
        } else System.out.println("invalid promo code!");
        
        return hargaTotal;
    }
    
     
}
