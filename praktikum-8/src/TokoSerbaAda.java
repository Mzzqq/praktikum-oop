import java.util.Scanner;

public class TokoSerbaAda {
    private static final String[] kodeBarang = {"a001", "a002", "a003"};
    private static final String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
    private static final int[] harga = {3000, 4000, 5000};
    private static int[] jumlahBeli; // Jumlah yang di beli

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String kode = "";
        // int jumlahBayar = 0;

        // Input item barang
        System.out.print("Masukkan item barang: ");
        int itemBarang = scanner.nextInt();

        jumlahBeli = new int[itemBarang]; // Initialize jumlahBeli

        for (int i = 0; i < itemBarang; i++) {
            // Input kode barang
            System.out.print("Data ke-" + (i + 1) + ":\n");
            System.out.print("Masukkan kode: ");
            String kode = scanner.next();

            // Input jumlah beli
            System.out.print("Masukkan jumlah beli: ");
            jumlahBeli[i] = scanner.nextInt();
        }


    }

    private static int cariIndeksKode(String kode) {
        for (int i = 0; i < kodeBarang.length; i++) {
            if (kodeBarang[i].equals(kode)) {
                return i;
            }
        }
        return -1;
    }

    private static int getTotalBayar(int itemBarang) {
        int totalBayar = 0;
        for (int i = 0; i < itemBarang; i++) {
            int index = cariIndeksKode(kodeBarang[i]);
            if (index != -1) {
                totalBayar += harga[index] * jumlahBeli[i];
            }
        }
        return totalBayar;
    }
}
