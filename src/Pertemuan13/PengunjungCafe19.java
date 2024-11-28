package Pertemuan13;

public class PengunjungCafe19 {
    public static void main(String[] args) {
        daftarPengunjung("ali" , "budi" , "citra");
    }

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("daftar nama pengunjung: ");
        for (String temp : namaPengunjung) {
            System.out.println("- " + temp);
        }
    }
}
