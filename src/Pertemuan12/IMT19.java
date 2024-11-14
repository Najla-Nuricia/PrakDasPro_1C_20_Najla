package Pertemuan12;
import java.util.Scanner;
public class IMT19 {
    public static void main(String[] args) {
        Scanner najla = new Scanner(System.in);

        double BB, TB, imt;

        System.out.println("===MENGHITUNG IMT===");
        System.out.print("Masukkan berat badan (kg): ");
        BB = najla.nextDouble();
        System.out.print("masukkan tinggi badan (cm): "); 
        TB = najla.nextDouble();

        imt = BB / ((TB/100)*(TB/100));

        System.out.println("IMT anda adalah: " + imt);

        if (imt < 17 ) {
            System.out.println("sangat kurus");
        } else if ( imt >= 17 && imt < 18.5 ) {
            System.out.println("kurus");
        } else if ( imt >= 18.5 && imt <= 25) {
            System.out.println("normal");
        } else if ( imt > 25 && imt <= 27 ) {
            System.out.println("gemuk");
        } else {
            System.out.println("obesitas");
        }

        najla.close();

    }
    
}
