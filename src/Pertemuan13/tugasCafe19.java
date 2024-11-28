package Pertemuan13;
import java.util.Scanner;
public class tugasCafe19 {

    static Scanner sc = new Scanner(System.in);
    static  String[] menu = {"kopi", "teh", "es degan", "roti bakar", "gorengan" };
    public static void main(String[] args) {
        int[][] dataPenjualan = inputData();
        tampilData(dataPenjualan);
        System.out.println("\nmenu dengan penjualan tertinggi: "+menuTertinggi(dataPenjualan));
        rataPerMenu(dataPenjualan);
    }

    static int[][] inputData() {
       
        int dataPenjualan[][] = new int[menu.length][7];
        for (int i = 0 ; i < dataPenjualan.length;i++) {
            System.out.println("masukkan data penjualan menu " + menu[i]);
            for (int j =0; j < dataPenjualan[i].length;j++) {
                System.out.print("hari ke-" + (j+1) +" :");
                dataPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return dataPenjualan;
    }

    static void tampilData(int[][] dataPenjualan) {
        System.out.printf("%-12s" , "menu");
        for (int k = 0; k < 7;k++) {
            System.out.printf("%-12s" , "hari ke-" + (k+1) );
        }
        System.out.println();
        for (int i =0 ;i < dataPenjualan.length; i++){
            System.out.printf("%-12s", menu[i]);
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.printf("%-12d", dataPenjualan[i][j]);
            }
            System.out.println();
        }
    }

    static String menuTertinggi(int[][] dataPenjualan ) { 
        String menuTertinggi= "null";
        int tertinggi = 0;
        for (int i = 0; i < dataPenjualan.length;i++) {
            int totalPjl = 0;
            for (int j =0; j <dataPenjualan[i].length;j++) {
                totalPjl += dataPenjualan[i][j];
            }
            if (totalPjl > tertinggi) {
                tertinggi = totalPjl;
                menuTertinggi = menu[i];
            }
        }
        return menuTertinggi;
    }

    static void rataPerMenu(int[][] dataPenjualan) { 
        System.out.println("\n==== RATA RATA PENJUALAN ====");
        for (int i =0; i < dataPenjualan.length;i++) {
            int total =0;
            for (int j =0; j < dataPenjualan[i].length;j++ ) {
                total += dataPenjualan[i][j];
            }
            System.out.printf("%-12s : %-10d %n", menu[i] , total/dataPenjualan[i].length);
        }
    } 
}
