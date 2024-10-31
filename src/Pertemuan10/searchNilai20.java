package Pertemuan10;

public class searchNilai20 {
    public static void main(String[] args) {
        int[] arrNilai = {80,85,78,98,90,82,86};
        int key = 90;
        int hasil = 0;

        for (int i=0; i<arrNilai.length;i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        System.err.println("nilai " + key + " ketemu di index ke-" + hasil);
        System.out.println();

    }
    
}
