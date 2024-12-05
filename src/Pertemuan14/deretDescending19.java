package Pertemuan14;

import java.util.Scanner;

public class deretDescending19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int a = sc.nextInt();
        deretrekursif(a);
        System.out.println();
        deretIteratif(a);
        sc.close();
    }

    static int deretrekursif (int a ) {
        if (a < 0) {
            return 0;
        } else {
            System.out.print(a);
            return deretrekursif(a-1);
        }
    }

    static void deretIteratif (int a) {
        for (int i = a ; i >= 0; i--) {
            System.out.print(i);
        }
    }
    
}
