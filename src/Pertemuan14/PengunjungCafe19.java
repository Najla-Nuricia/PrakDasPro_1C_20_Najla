package Pertemuan14;

public class PengunjungCafe19 {
    public static void main(String[] args) {
        daftarPengunjung("ali" , "budi" , "citra");
    }

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("daftar nama pengunjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
}
