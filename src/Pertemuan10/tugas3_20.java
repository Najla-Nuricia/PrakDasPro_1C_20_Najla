package Pertemuan10;

import java.util.Scanner;

public class tugas3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menuDcr;
        int hasil = 0;
        String[] menu = {"Nasi goreng", "mie goreng", "roti bakar", "kentang goreng", "teh tarik", "cappucino", "chocolate ice"};

        // System.out.println("==== Menu ====");

        // for (int i = 0; i<menu.length;i++) {
        //     System.out.println((i+1) + "." + " " + menu[i]);
        // }

        System.out.print("masukkan menu yang ingin dicari: ");
        menuDcr = sc.nextLine();

        for (int i = 0; i<menu.length;i++) {
            if (menu[i].equalsIgnoreCase(menuDcr)) {
                hasil = i+1;
                System.out.println("menu " + menu[i] + " tersedia");
            }
        }
        if (hasil == 0) {
            System.out.println("menu tidak tersedia");
        }
        sc.close();
    }
    
}
