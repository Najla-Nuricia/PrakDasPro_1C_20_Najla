package Pertemuan14;

public class Kafe19 {
    public static void main(String[] args) {
        Menu("andi" , true);
    }

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("selamaat datang, " + namaPelanggan + " !");

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
    
     
}
