package Pertemuan9;
import java.util.Scanner;
public class rataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int  i = 1;
      double nilai, totalNilai, rataNilai;
      while (i<=5) {
        System.out.println("input nilai mhs ke-" + i );
        totalNilai=0;
        for (int j=1;j<=5;j++) {
            System.out.print("nilai ke-" + j + ": ");
            nilai = sc.nextInt();
            totalNilai +=nilai;
        }
        rataNilai=totalNilai/5;
        System.out.println("rata rata nilai mhs ke-" + i + " adalah " + rataNilai);
        i++;
      }
      sc.close();
    }
    
}
