package Pertemuan10;
import java.util.Scanner;
public class arrayRataNIlai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int lulus=0, tidakLulus = 0;

        for (int i=0; i< nilaiMhs.length; i++) {
            System.out.print("masukkan nilai mhs ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt(); 
            if (nilaiMhs[i] > 70 ) {
               lulus++;
            } else {
                tidakLulus++;
            }
        } 
        for (int i = 0; i < nilaiMhs.length;i++) {
            total += nilaiMhs[i];
        } 
        
        rata2 = total/nilaiMhs.length;
        System.out.println("rata - rata : "+ rata2);
        System.out.println("mahasiswa yang lulus: " + lulus);
        System.out.println("Mahasiaswa yang tidak lulus: " + tidakLulus);

        sc.close();;

    }
    
}
