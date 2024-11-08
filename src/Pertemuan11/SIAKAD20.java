package Pertemuan11;
import java.util.Scanner;
public class SIAKAD20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa: ");
        int mhs = sc.nextInt();
        System.out.print("masukkan jumlah mata kuliah: ");
        int matkul = sc.nextInt();

        int [][] nilai = new int[mhs][matkul];

        for (int i = 0; i< nilai.length;i++) {
            System.out.println("input nilai mahasiswa ke-" + (i+1));
            double totalPersiswa = 0;

            for (int j = 0; j<nilai[i].length;j++) {
                System.out.print(" nilai mata kuliah "+ (j+1)+ ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }

            System.out.println("nilai rata - rata: " + totalPersiswa/matkul);
        }

        System.out.println("\n===============================");
        System.out.println("Rata - rata Nilai setiap mata kuliah: "); 

        for (int j = 0; j< matkul;j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < mhs; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("mata kuliah " + (j+1)+ ": " + totalPerMatkul/mhs);
        }
        sc.close();
    }
    
}
