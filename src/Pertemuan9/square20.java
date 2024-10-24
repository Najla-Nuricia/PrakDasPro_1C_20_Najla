package Pertemuan9;
import java.util.Scanner;
public class square20 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);
        System.out.print("masukkan nilai n: ");
        int n = sc20.nextInt();

        for(int iOuter=1; iOuter<=n; iOuter++) {
            for (int i = 0; i<=n; i++) {
                System.out.print("*");
            }
        }
        sc20.close();
       
    }
    
}
