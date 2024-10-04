package Pertemuan6;

public class Pertemuan6Tugas1 {
    public static void main(String[] args) {

        int bil1 = 28, bil2=54, bil3=15;

        if ((bil1)>(bil2)) {
            if ((bil1)>(bil3)) {
                System.out.println("bilangan " + bil1 + " terbesar");
            } else {
                System.out.println("biangan " + bil3 + "terbesar");
            }
        } else if ((bil2)>(bil3)) {
            System.out.println("bilangan " + bil2 + " terbesar");
        } else {
            System.out.println("bilangan " + bil3 + " terbesar");
        }
    }
    
}
