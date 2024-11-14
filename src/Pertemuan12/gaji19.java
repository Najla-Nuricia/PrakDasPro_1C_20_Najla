package Pertemuan12;
import java.util.Scanner;
public class gaji19 {
    public static void main(String[] args) {
        Scanner najla = new Scanner(System.in);

        int gaji=0, jamMin, jamPlus;

        System.out.print("masukkan jam kerja per minggu: ");
        int jam = najla.nextInt();

        if ( jam < 50) {
            gaji = jam*5000;
            jamMin = (jam - 50)*2500;
            gaji += jamMin;
        } else if ( jam >= 50 && jam <= 60) {
            gaji = jam*5000;
        } else if ( jam > 60) {
            gaji = 60*5000;
            jamPlus = (jam - 60)*7500;
            gaji += jamPlus;
        }

        System.out.println("total upah anda Rp." + gaji );

        najla.close();
    }
}
