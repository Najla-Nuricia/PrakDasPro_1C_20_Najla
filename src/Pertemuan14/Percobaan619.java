package Pertemuan14;

import java.util.Scanner;

public class Percobaan619 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p , l , t, vol, Ls;

        System.out.print("masukkan panjang :");
        p = sc.nextInt();
        System.out.print("masukkan lebar: ");
        l = sc.nextInt();
        System.out.print("masukkan tinggi : ");
        t = sc.nextInt();

        vol = p * l * t;
        Ls = p * l;
        System.out.println("luas persegi panjang " + Ls);
        System.out.println("volume balok adalah " + vol);
        sc.close();
    }
    
}
