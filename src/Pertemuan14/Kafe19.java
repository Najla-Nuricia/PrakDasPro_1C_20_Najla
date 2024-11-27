package Pertemuan14;
import java.util.Scanner;
public class Kafe19 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Menu("andi" , false);

        int pilihanMenu, banyakItem, totalAll=0, pesanan, bnykPesanan=0;
        String kodePromo = "invalid";
        double totalHarga=0;
       

        System.out.print("masukkan berapa menu yang akan di pesan: ");
        pesanan = sc.nextInt();
        String simpanMenu[] = new String[pesanan];
        sc.nextLine();

        System.out.print("masukkan kode promo: ");
        kodePromo = sc.nextLine();


        for (int i = 0 ; i < pesanan; i++) {
            System.out.print("\nmasukkan nomor menu yang ingin anda pesan : ");
            pilihanMenu = sc.nextInt();
            System.out.print("masukkan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();
            sc.nextLine(); 

            totalHarga = hitungTotalHarga19(pilihanMenu, banyakItem, kodePromo);
            totalAll += totalHarga; 

           simpanMenu[bnykPesanan] = "menu " + pilihanMenu + " " + banyakItem + " item : " + "Rp." + totalHarga;
           bnykPesanan++;
        }
        tampilStruk(bnykPesanan, simpanMenu);
        
        System.out.println("total harga untuk pesanan anda: Rp. " + totalAll);
    }
    
    static void tampilStruk(int bnykPesanan, String[]simpanMenu) {
        System.out.println("===Struk belanja anda===");
        for (int i = 0; i < bnykPesanan;i++) {
            System.out.println(simpanMenu[i]);
        }
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
