package Pertemuan10;
import java.util.Scanner;
public class searchNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrNilai = new int[10];
        int hasil = 0;
        int jmlMhs, nilaiDcr;

        System.out.print("masukkan banyak nilai yang akan diinput: ");
        jmlMhs = sc.nextInt();

        for (int i=0; i<jmlMhs;i++) {
            System.out.print("masukkan nilai mahasiswa ke-"+ (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
            } 
            System.out.print("masukkan nilai yg ingin dicari: ");
            nilaiDcr = sc.nextInt();

        for (int i = 0; i<jmlMhs;i++) {
                if (nilaiDcr == arrNilai[i] ) {
                    hasil = (i+1);
                    System.out.println("nilai " + nilaiDcr + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
                } else {
                    System.out.println("nilai yang dicari tidak ditemukan");
                    break;
                }
            }
            sc.close();
        }

    }
    