package Pertemuan14;
import java.util.Scanner;
public class percobaan219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("bilangan yang di hitung: ");
        int bilangan = sc.nextInt();
        System.out.print("pangkat: ");
        int pangkat = sc.nextInt();
        sc.close();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
    static int hitungPangkat(int x , int y) {
        if (y == 0) {
            return (1);
        }else { 
            return (x * hitungPangkat(x, y - 1));
        }
    }
}
