package Pertemuan5;

import java.util.Scanner;

public class PemilihanBilangan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Angka:");
        int angka = sc.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? " Termasuk bilangan genap" : " Termasuk bilangan ganjil";

        System.out.println( "Angka " + angka + hasil );
    
    }
}
