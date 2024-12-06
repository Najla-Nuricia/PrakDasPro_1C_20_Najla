package Pertemuan14;

import java.util.Scanner;

public class cekPrimaRekursif19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = sc.nextInt();
        cekPrima(angka, angka -1);
        boolean isPrima = cekPrima(angka, angka-1);

        if (isPrima) {
            System.out.println("prima");
        } else {
            System.out.println("bukan prima");
        }
        sc.close();
    }
    static boolean cekPrima(int a, int b) {
        if (b == 1) {
            return true;
        }
        if (a < 2){
            return false;
        }
        if ( a % b == 0) {
            return false;
        }
       
        return cekPrima(a, b-1);
       
    }
    
}
