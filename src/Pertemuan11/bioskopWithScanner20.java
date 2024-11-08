package Pertemuan11;

import java.util.Scanner;

public class bioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, next, data;
        int baris, kolom, menu;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("===MENU===");
            System.out.println("1. masukkan nama penonton");
            System.out.println("2. tampilkan data ");
            System.out.println("3. exit");
            System.out.print("Masukkan opsi menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            if (menu == 1) {
                while (true) {
                    System.out.print("masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
            
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(penonton[i][j] + " ");
                        }
                        System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Opsi tidak valid, silakan coba lagi.");
            }
        }

        sc.close();
    }
}