package Pertemuan14;
import java.util.Scanner;
public class percobaan319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        System.out.print("jumlah saldo awal: ");
        saldoAwal = sc.nextInt();
        System.out.print("lama investasi(tahun): ");
        tahun = sc.nextInt();

        System.out.print("jumlah saldo setelah " + tahun + " tahun: ");
        System.out.println(hitungLaba(saldoAwal, tahun));
        sc.close();
    }
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun -1));
        }
        
    }
    
}
