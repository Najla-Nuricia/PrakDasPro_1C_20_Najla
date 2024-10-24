package Pertemuan9;
import java.util.Scanner;
public class star20 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        System.out.print("masukkan nilai N: ");
        int N = sc20.nextInt();

        for (int i=1;i<=N;i++) {
            System.out.print("*");
        }
        sc20.close();
    }

    
}
