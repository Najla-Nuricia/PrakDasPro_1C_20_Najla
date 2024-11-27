package Pertemuan13;
import java.util.Scanner;
public class kuis2_20 {
    public static void main(String[] args) {
        Scanner najla = new Scanner(System.in);
        int[][] penjualan20 = {
            {2,3,4,6},
            {2,3,3,2},
            {4,4,5,5},
            {1,3,3,8},
            {2,2,2,2}
        };

        String[][] nama20 = {
            {"sito"},
            {"semi"},
            {"risma"},
            {"vero"},
            {"barri"}
        };

        String[] bulan20 = {"jan", "feb", "maret", "april"};
        while (true) {
            System.out.println("menu");
            System.out.println("1. tampilakn rekap penjualan");
            System.out.println("2. tampilkan total penjualan perbulan");
            System.out.println("pilih menu: ");
            int menu20 = najla.nextInt();

            if ( menu20 == 1) {

                for ( int i = 0; i < bulan20.length; i ++) {

                    System.out.printf("%-10s" , bulan20[i]);
  
                }
                System.out.println();
                for (int i = 0; i <penjualan20.length;i++) {
                    System.out.printf("%-12s" , nama20[i]);
                    for (int j = 0; j <penjualan20[i].length;j++) {
                    
                        System.out.printf("%-10d" , penjualan20[i][j]);
                    
                    }
                    System.out.println();
                }

            
            
            } else if ( menu20 == 2) {
                for ( int i = 0; i < bulan20.length; i ++) {
                    System.out.print( "            "+bulan20[i] + "   ");
                }
                System.out.println();
                for (int i = 0; i <penjualan20.length;i++) {
                    System.out.printf("%-12s" , nama20[i]);
                    for (int j = 0; j <penjualan20[i].length;j++) {
                    
                        System.out.printf("%-18d" , penjualan20[i][j] * 1000000);
                    
                    }
                    System.out.println();
                }

                System.out.println();
                System.out.println("total penjualan tiap bulan");
                for (int i = 0; i < penjualan20.length;i++) {
                    int totalBln = 0, totalPjl=0;
                    for ( int j = 0; j <penjualan20[i].length; j++) {
                        totalBln = penjualan20[i][j] * 1000000;
                       
                    }
                    totalPjl += totalBln;
                    System.out.println(bulan20[i] + " "+ totalPjl);
                }

            }
            
        }

    }
    
}
