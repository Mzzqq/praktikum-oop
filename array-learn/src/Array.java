import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] warna = new String[10];
        String colorize;

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan warna ke-" + (i+1) + ": ");
            colorize = scanner.next();
            warna[i] = colorize;
        }
        System.out.println();
        System.out.println("Output isi array: ");
        for (String i: warna) {
            System.out.println(i);
        }
    }
}
