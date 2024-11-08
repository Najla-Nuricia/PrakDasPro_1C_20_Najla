package Pertemuan11;

import java.util.Scanner;

public class tugas20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int survei[][] = new int[10][6];

        System.out.println("====INPUT JAWABAN====");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("input jawaban surver responden ke-" + (i+1));
          
            for (int j = 0; j < survei[i].length;j++) {
                System.out.print("masukkan jawaban pertanyaan ke-" + (j+1) + " (1-5):");
                survei[i][j] = sc.nextInt();
            }
        }

        double rataAll=0;
        System.out.println("===RATA - RATA SETIAP RESPONDEN===");
        for (int i = 0; i < survei.length;i++) {
            double totalJwb = 0;
            for (int j = 0 ; j < survei[i].length;j++) {
                totalJwb += survei[i][j];
            }
            double rata = totalJwb/6;
            System.out.println("rata - rata responden ke-"+(i+1)+ ": " + rata); 
            rataAll += rata/10;
        }

        System.out.println("===RATA - RATA SETIAP PERTAYAAN===");
        for (int j = 0; j < 6; j++) {
            double totalPty=0;
            for (int i = 0; i < 10;i++) {
                totalPty += survei[i][j];
            }
            double rata2 = totalPty/10;
            System.out.println("rata - rata pertanyaan ke-"+(j+1)+ ": "+rata2);
        }
        
        System.out.println("===RATA - RATA KESELURUHAN===");
        System.out.println("Rata - rata keseluruhan: " + rataAll);
        
       

        sc.close();
    }
    
}
