package Pertemuan9;

import java.util.Scanner;

public class tugas1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan n (minimal 3): ");
        int n = sc.nextInt();

        for (int i = 0;i<n;i++) {
            for (int j = 0; j<n;j++) {
                if (i==0 || i== n-1) {
                    System.out.print(n + " ");
                } else if (j==0 || j == n-1  ) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }   
}
