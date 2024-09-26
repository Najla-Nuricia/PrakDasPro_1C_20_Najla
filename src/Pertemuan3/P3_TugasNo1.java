package Pertemuan3;
import java.util.Scanner;

public class P3_TugasNo1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    boolean lebihDari500kWH;
    double tarifListrik, tagihanListrik;

    System.out.print("Masukkan tarif listrik: ");
    tarifListrik = input.nextDouble();
    System.out.print("Apakah lebih dari 500 kWh (true/false): ");
    lebihDari500kWH = input.nextBoolean();

    tagihanListrik = (tarifListrik * 1500);

    System.out.println("Total tagihan listrik Rp" + tagihanListrik);

    input.close();
  }

}
