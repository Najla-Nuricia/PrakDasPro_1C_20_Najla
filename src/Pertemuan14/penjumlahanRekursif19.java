package Pertemuan14;

import java.util.Scanner;

public class penjumlahanRekursif19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = sc.nextInt();
        penjumlahan(angka);
        tampilPenjumlahan(angka);
        sc.close();
    }
    static int penjumlahan(int a) {
        if (a == 0) {
            return 0;
        } else {
            return (a + penjumlahan(a - 1));
        }
    }

    static void tampilPenjumlahan (int a){
        for (int i = a; i > 0; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" + ");
            }
            
        }
        System.out.print( " = " + penjumlahan(a));
    }
    
}
