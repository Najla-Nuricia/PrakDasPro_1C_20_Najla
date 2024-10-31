package Pertemuan10;
import java.util.Scanner;
public class arrayNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i=0; i< nilaiAkhir.length;i++) {
            System.out.print("masukkan nilai akhir ke-" + i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0;i<10;i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("mahasiswa ke-"+i+" lulus!");
            }
        }
        sc.close();
    }
    
}
