package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan320 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak=0.0;

        System.out.print("Masukkan Kategori : ");
        kategori = sc20.nextLine();
        System.out.print("masukkan besar penghasilan : ");
        penghasilan = sc20.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <=2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 35000000){
                pajak = 0.2;
            } else {
                pajak = 0.25;
            } 
        } else {
            System.out.println("kategori salah");
        }

        gajiBersih = (int) (penghasilan - (penghasilan*pajak));
        System.out.println("gaji bersih: " + gajiBersih);

        sc20.close();
    }
    
}
