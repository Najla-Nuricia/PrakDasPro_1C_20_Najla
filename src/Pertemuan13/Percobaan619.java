package Pertemuan13;

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

        Ls = hitungLuas(p,l);
        System.out.println("luas persegi panjang adalah " + Ls);
        vol = hitungVolume(t, p, l);
        System.out.println("volume balok adalah " + vol);
        sc.close();
    }
    static int hitungLuas (int p, int l) {
        int Ls = p*l;
        return Ls;
    }

    static int hitungVolume (int t, int pj , int lb) {
        int volume = hitungLuas(pj, lb) * t;
        return volume;
    }
    
}
