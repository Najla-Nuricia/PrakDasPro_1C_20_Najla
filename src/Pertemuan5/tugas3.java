package Pertemuan5;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlNasgor, jmlMie, jmlFuyunghai, totalBelanja, totalBelanjaStlhDiskon;
        int hargaNasgor, hargaMie, hargaFuyunghai; 

        System.out.println("Jumlah Makanan");

        System.out.print("Nasi goreng: ");
        jmlNasgor = sc.nextInt();
        System.out.print("Mie Rebus: ");
        jmlMie = sc.nextInt();
        System.out.print("fuyunghai: ");
        jmlFuyunghai = sc.nextInt();

        System.out.println("harga makanan");

        System.out.print("harga Nasi goreng: ");
        hargaNasgor = sc.nextInt();
        System.out.print("harga mie rebus: ");
        hargaMie = sc.nextInt();
        System.out.print("harga fuyunghai: ");
        hargaFuyunghai = sc.nextInt();
        totalBelanja = (jmlNasgor*hargaNasgor) + (jmlMie*hargaMie) + (jmlFuyunghai*hargaFuyunghai);

        System.out.println("");
        
        if (totalBelanja > 500000) {
            totalBelanjaStlhDiskon = totalBelanja - (totalBelanja*1/10);
            System.out.println("Total belanja anda: " + totalBelanja);
            System.out.println("total setelah diskon: " + totalBelanjaStlhDiskon);
        } else if (totalBelanja >200000 && totalBelanja<=500000) {
            totalBelanjaStlhDiskon = totalBelanja - (totalBelanja*5/100);
            System.out.println("Total belanja anda: " + totalBelanja);
            System.out.println("total setelah diskon: " + totalBelanjaStlhDiskon);
        } else if (totalBelanja >100000 && totalBelanja <=200000) {
            totalBelanjaStlhDiskon = totalBelanja - (totalBelanja*2/100);
            System.out.println("Total belanja anda: " + totalBelanja);
            System.out.println("total setelah diskon: " + totalBelanjaStlhDiskon);
        } else if (totalBelanja<=100000) {
            totalBelanjaStlhDiskon = totalBelanja;
            System.out.println("Total belanja anda: " + totalBelanja);
            System.out.println("total setelah diskon: " + totalBelanjaStlhDiskon);
            System.out.println("Tidak mendapat diskon");
        }

        sc.close();
    }
    
}
