package Pertemuan4;

import java.util.Scanner;

/**
 * kuis1_no3
 */
public class kuis1_no3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jam20, menit20, jammenit, menitKuliah, jamKuliah20, menitKuliah20;

        System.out.print("Masukkan jam saat ini: ");
        jam20 = sc.nextInt();
        jammenit = jam20 * 60;
        System.out.print("Masukkan menit saat ini: ");
        menit20 = sc.nextInt(); 
        jammenit += menit20;

        System.out.println("pukul saat ini: " + jam20 + ":" + menit20);

        System.out.print("Masukkan lama kuliah dalam menit: ");
        menitKuliah = sc.nextInt(); 

        jamKuliah20 = (jammenit + menitKuliah) / 60;
        menitKuliah20 = jammenit - (jamKuliah20 * 60) + menitKuliah;
        System.out.println(jamKuliah20);
        System.out.println(menitKuliah20);


    }
}