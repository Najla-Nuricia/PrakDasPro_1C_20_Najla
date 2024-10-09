package Pertemuan7;

import java.util.Scanner;

public class SiakadWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i=0;

        System.out.print("masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("masukkan nilai mhs ke-" + (i + 1)+ ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.print("nilai tidak valid , masukkan nilai yang valid");
                continue;
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("nilai mhs ke-" + ( i + 1) + "adalah a"); 
                System.out.println("bagus pertahankan nilainya!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("nilai mhs ke-" + (i + 1)+ "adalah b+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("nilai mhs ke-" + (i + 1)+ "adalah b");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("nilai mhs ke-" + (i + 1)+ "adalah c+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("nilai mhs ke-" + (i + 1)+ "adalah c");
            } else if (nilai > 39  && nilai <= 50) {
                System.out.println("nilai mhs ke-" + (i + 1)+ "adalah d");
            } else {
                System.out.println("nilai mhs ke-" + (i + 1)+ "adalah e");
            }
            i++;
            } 
            
        }
    }
    

