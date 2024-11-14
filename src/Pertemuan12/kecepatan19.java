package Pertemuan12;
import java.util.Scanner;
public class kecepatan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan waktu dalam jam : ");
        double jam = sc.nextDouble();

        System.out.print("masukkan kecepatan (km/jam): ");
        double kecepatan = sc.nextDouble();

        double jarak = kecepatan*jam;
        double jarakMeter = jarak*1000;

        System.out.println("===OUTPUT===");
        System.out.println("kecepatan : " + kecepatan + " km/jam");
        System.out.println("Waktu : " + jam + " jam");
        System.out.println("jarak: " + jarak + " km");
        System.out.println("jarak dalam meter: " + jarakMeter + " m");

        sc.close();

    }
    
}
