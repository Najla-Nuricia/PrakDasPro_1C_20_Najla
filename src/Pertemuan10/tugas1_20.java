package Pertemuan10;

import java.util.Scanner;

public class tugas1_20 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jmlNilai, tertinggi = 0, terendah = 100, rata, totalNilai=0;

        System.out.print("masukkan banyak nilai yang akan diinput: ");
        jmlNilai = sc.nextInt(); 
        int[] nilai = new int[jmlNilai];

        //memasukkan nilai dan nilai tertinggi terendah
        for ( int i = 0; i< nilai.length; i++) {
            System.out.print("masukkan nilai mahasisawa ke-"+(i+1)+" : ");
            nilai[i] = sc.nextInt();

        } 

        for (int i = 0; i< nilai.length;i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            } 
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        // total nilai
        for (int i = 0;i<nilai.length;i++) {
            totalNilai += nilai[i];
        }
       
        //menampilkan nilai 
        for (int i = 0;i<nilai.length;i++) {
            System.out.println("nilai mahasiswa ke-" +(i+1)+" adalah "+ nilai[i]);
        }
        
        rata= totalNilai/jmlNilai;

        System.out.println();
        System.out.println("Rata - rata nilai: "+ rata);
        System.out.println("nilai tertinggi: "+ tertinggi);
        System.out.println("nilai terendah: "+ terendah);
        sc.close();
    }
    
}
