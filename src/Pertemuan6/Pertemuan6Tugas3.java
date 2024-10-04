package Pertemuan6;

import java.util.Scanner;

public class Pertemuan6Tugas3 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        String merk, kategori;
        int ukuran, harga=0;

        System.out.print("masukkan merk: "); 
        merk = sc20.nextLine();
        System.out.print("masukkan kategori: ");
        kategori = sc20.nextLine();
        System.out.print("masukkan ukuran: ");
        ukuran = sc20.nextInt();

        if (merk.equalsIgnoreCase("converse")) {
           if (kategori.equalsIgnoreCase("slip on")) {
            if (ukuran >= 36) {
                if (ukuran <=40) {
                    harga = 800000;
                } else {
                    System.out.println("ukuran tidak tersedia: ");
                }
            } else {
                System.out.println("ukuran tidak tersedia");
            }
           } else if (kategori.equalsIgnoreCase("high top")) {
            if (ukuran >= 40) {
                if (ukuran <=44) {
                    harga = 1200000;
                } else {
                    System.out.println("ukuran tidak tersedia: ");
                } 
            } else {
                System.out.println("ukuran tidak tersedia");
            }
           } else {
            System.out.println("kategori salah");
           }
        } else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran<=40) {
                        harga = 1000000;
                    } else {
                        System.out.println("ukuran tidak tersedia");
                    }
                }  else {
                    System.out.println("ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >=41) {
                    if (ukuran <=44) {
                        harga = 1800000;
                    } else {
                        System.out.println("ukuran tidak tersedia");
                    }
                } else {
                    System.out.println("ukuran tidak tersedia");
                }
            } else {
                System.out.println("kategori salah");
            }
        } else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >36) {
                    if (ukuran <=40) {
                        harga = 750000;
                    } else {
                        System.out.println("ukuran tidak tersedia");
                    }
                } else {
                    System.out.println("ukuran tidak tersedia");
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >=40) {
                    if (ukuran <=44) {
                        harga = 1500000;
                    } else {
                        System.out.println("ukuran tidak tersedia");
                    }
                } else {
                    System.out.println("ukuran tidak tersedia");
                }
            } else {
                System.out.println("kategori salah");
            }
        } else {
            System.out.println("merk salah");
        }
        System.out.println("------------------------------------");

        System.out.println("merk sepatu : " + merk);
        System.out.println("katgori sepatu : " + kategori);
        System.out.println("ukuran sepatu : " + ukuran );
        System.out.println("harga sepatu : " + harga );

        sc20.close();
    }
    
}
