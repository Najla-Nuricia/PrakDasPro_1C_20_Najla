package Pertemuan5;

import java.util.Scanner;

public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayNumber; 
        System.out.println("input number between 1 - 7: ");
        dayNumber = sc.nextInt();

        if (dayNumber == (1) || dayNumber == (2) || dayNumber==(3) || dayNumber==(4)|| dayNumber==(5) ) {
            System.out.println("weekday");
        } else if (dayNumber == (6) || dayNumber == (7)) {
            System.out.println("weekend");
        } else {
            System.out.println("invalid number");
        }

        sc.close();


    }
    
}
