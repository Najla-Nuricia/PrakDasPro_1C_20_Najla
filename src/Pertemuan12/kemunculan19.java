package Pertemuan12;

import java.util.Scanner;

public class kemunculan19 {
    public static void main(String[] args) {
        Scanner najla = new Scanner(System.in);

        int angka;

        int[][] matrik = {
            {1,2,2,2,2},
            {3,4,7,8,9},
            {9,9,10,10},
        };


        while(true) {
            for (int i = 0; i < matrik.length;i++) {
                for (int j = 0;j <matrik[i].length;j++) {
                    System.out.print(" " + matrik[i][j]);
                }
                System.out.println();
            }
            System.out.print("masukkan angka: ");
            angka = najla.nextInt();
            for (int j = 0; j < matrik.length;j++) {
                int angkaTotal = 0;
                for (int i = 0; i < matrik[j].length;i++) {
                    if(angka == matrik[j][i]) {
                        angkaTotal++;
                    }
                    continue;
                }
                System.out.println(angka + " muncul " + angkaTotal + " kali");
            }
            najla.nextLine();
            System.out.print("apakah anda ingin mengulang?(y/n): ");
                String ulang = najla.nextLine();

                if (ulang. equalsIgnoreCase("y")) {
                    continue;
                } else {
                    break;
                }
        }

        najla.close();
    }
}   

