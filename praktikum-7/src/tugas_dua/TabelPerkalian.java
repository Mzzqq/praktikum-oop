package tugas_dua;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai tabel perkalian: ");
        int batasan = scanner.nextInt();

        if (batasan <= 10) {
            for (int i = 1; i <= batasan; i++) {
                for (int j = 1; j <= batasan; j++){
                    System.out.print((j*i) + "\t");
                }
                System.out.println();
            }
        }
    }
}
