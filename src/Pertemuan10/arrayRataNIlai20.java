package Pertemuan10;
import java.util.Scanner;
public class arrayRataNIlai20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double lulus=0, tidakLulus = 0, totalLulus=0, totalTl =0;
        double rataLulus, rataTL;
        int jmlMhs;

        System.out.print("masukkan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();

        for (int i=0; i< jmlMhs; i++) {
            System.out.print("masukkan nilai mhs ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70 ) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                tidakLulus++;
                totalTl += nilaiMhs[i];
            }
        }

        rataLulus = totalLulus / lulus;
        rataTL = totalTl/tidakLulus;
        System.out.println("rata mahasiswa yang lulus: " + rataLulus);
        System.out.println("rata Mahasiswa yang tidak lulus: " + rataTL);
        sc.close();
    }
}
