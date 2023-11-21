package tugas_satu;

import java.util.Scanner;

public class AnakAyam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan input angka anak ayam: ");
        int counter = scanner.nextInt();

        for (int i = 0; i <= counter; i++){
            System.out.println("Anak Ayam Turun " + i);
        }
    }
}
