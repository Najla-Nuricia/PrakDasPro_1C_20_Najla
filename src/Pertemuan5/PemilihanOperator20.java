package Pertemuan5;

import java.util.Scanner;

public class PemilihanOperator20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char operator;
        double angka1, angka2, hasil = 0;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            hasil = angka1 / angka2;
        } else {
            System.out.println("maaf operator tidak terdaftar");
        }

        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);

    }
}
