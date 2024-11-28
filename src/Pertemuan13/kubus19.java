package Pertemuan13;
import java.util.Scanner;
public class kubus19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===menghitung volume kubus dan luas permukaan nya===");
        System.out.print("masukkan panjang sisi kubus (cm): ");
        int sisi = sc.nextInt();

        double vol = hitungVol(sisi);
        System.out.println("volume kubus : " + vol);
        double Lp = hitungLP(sisi);
        System.out.println("luas permukaan kubus : " + Lp);
        sc.close();
    }

    static double hitungVol(int sisi) {
        double vol = Math.pow(sisi, 3);
        return vol;
    } 
    
    static double hitungLP(int sisi) {
       double Lp = 6 * Math.pow(sisi,2);
       return Lp;
    } 

}
