package Pertemuan9;

import java.util.Scanner;

public class tugas2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah politeknik yang mengikuti porseni: ");
        int poltek = sc.nextInt();
        sc.nextLine();

        for (int i = 1 ; i <= poltek;i++ ) {
            System.out.println("Politeknik ke-" + i);
                System.out.println(" Atlet Badminton");
                for (int k = 1 ; k<=5;k++) {
                    System.out.print(k +". ");
                    String atlet = sc.nextLine();
                }
                System.out.println("Atlet tenis meja");
                for (int k = 1 ; k<=5;k++) {
                    System.out.print(k +". ");
                    String atlet = sc.nextLine();
                }
                System.out.println("Atlet basket");
                for (int k = 1 ; k<=5;k++) {
                    System.out.print(k +". ");
                    String atlet = sc.nextLine();
                }
                System.out.println("Atlet voly");
                for (int k = 1 ; k<=5;k++) {
                    System.out.print(k +". ");
                    String atlet = sc.nextLine();
                }
            }
            sc.close();
        }
    
    
}
