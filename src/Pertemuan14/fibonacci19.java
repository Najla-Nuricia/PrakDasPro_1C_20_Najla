package Pertemuan14;

import java.util.Scanner;

public class fibonacci19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan bulan: ");
        int bulan = sc.nextInt();
        int pasangan = fibonacci(bulan);

        System.out.println("pasangan marmut pada akhir bulan ke-" + bulan + " adalah " + pasangan + " pasangan ");
        sc.close();
    }
    static int fibonacci(int a) {
        if (a == 0) {
            return a;
        }
        if ( a == 1) {
            return a;
        }
        return fibonacci(a - 1) + fibonacci(a - 2);
    }
    
}
