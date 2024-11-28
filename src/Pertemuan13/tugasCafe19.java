package Pertemuan13;
import java.util.Scanner;
public class tugasCafe19 {

    static Scanner sc = new Scanner(System.in);
    static String[] menu;
    public static void main(String[] args) {

        System.out.print("masukkan berapa menu yang akan di input: ");
        int brpMenu = sc.nextInt(); 
        System.out.print("masukkan berapa hari yang akan di input: ");
        int brpHari = sc.nextInt();
        sc.nextLine();

        menu = new String[brpMenu];
        inputNamamenu(brpMenu);
        int[][] dataPenjualan = inputData(brpMenu, brpHari);
        tampilData(dataPenjualan);
        System.out.println("\nmenu dengan penjualan tertinggi: "+menuTertinggi(dataPenjualan));
        rataPerMenu(dataPenjualan);
    }

    static String[] inputNamamenu(int brpMenu){
        for (int i = 0; i < brpMenu; i++) {
            System.out.print("masukkan nama menu ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();
        }
        return menu;
    }

    static int[][] inputData(int brpMenu, int brpHari) {
       
        int dataPenjualan[][] = new int[brpMenu][brpHari];
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
        for (int k = 0; k < dataPenjualan[0].length;k++) {
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
