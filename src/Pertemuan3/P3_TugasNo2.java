package Pertemuan3;
import java.util.Scanner;

public class P3_TugasNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double penghasilanPerJam, jamKerja, gaji, gajiBonus, gajiBersih;
        float bonus = 10 / 100f, pajak = 5/100f;

        System.out.print("Masukkan jam kerja: ");
        jamKerja = input.nextDouble();
        System.out.print("Masukkan penghasilan per jam: ");
        penghasilanPerJam = input.nextDouble();

        gaji = (jamKerja * penghasilanPerJam);
        gajiBonus = gaji + (gaji * bonus);
        gajiBersih = (gajiBonus - (gajiBonus * pajak)) * 30;

        System.err.println("Gaji anda Rp" + gajiBersih);
        input.close();
    }
}
