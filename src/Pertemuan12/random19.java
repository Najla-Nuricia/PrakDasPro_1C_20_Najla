package Pertemuan12;
import java.util.Scanner;
public class random19 {
    public static void main(String[] args) {
        Scanner najla = new Scanner(System.in);

        int max = 100;
        int min = 0;
        int range = max - min + 1;
        int rand = (int) (Math.random()* range) + min;
        int angka;
        
        while(true) {
            System.out.print("angka tebakan 0 - 100: ");
            angka = najla.nextInt();
            if ( angka < rand ) {
                System.out.println("angka terlalu kecil");
                continue;
            } else if ( angka > rand) {
                System.out.println("angka terlalu besar ");
            } else {
                System.out.println("tebakan benar");
                break;
            }
        }
        najla.close();
    }
    
}
