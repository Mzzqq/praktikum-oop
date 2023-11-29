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
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukkan item barang: ");
        int itemBarang = scanner.nextInt();

        jumlahBeli = new int[itemBarang]; // Initialize jumlahBeli
        for (int i = 0; i < itemBarang; i++) {
            // Input kode barang
            System.out.print("Data ke " + (i + 1) + ":\n");
            System.out.print("Masukkan kode \t\t\t: ");
            String kode = scanner.next();

            // Input jumlah beli
            System.out.print("Masukkan jumlah beli \t: ");
            jumlahBeli[i] = scanner.nextInt();
        }

        System.out.println("\n\n");
        System.out.println("TOKO SERBA ADA");
        System.out.println("*************************");
        System.out.println("No\tKode Barang\t\tNama Barang\t\tHarga\tJumlah Beli\t\tJumlah Bayar");
        System.out.println("================================================================================");
        int totalBayar = 0;
        for (int i = 0; i < itemBarang; i++){
            int index = cariIndeksKode(kodeBarang[i]);
            if (index != -1) {
                int jumlahBayar = harga[index] * jumlahBeli[i];
                totalBayar += jumlahBayar; // Hitung jumlah bayar
                System.out.println((i + 1) + "\t" + kodeBarang[i] + "\t\t\t" + namaBarang[index] + "\t\t\t" + harga[index] + "\t" + jumlahBeli[i] + "\t\t\t\t" + jumlahBayar);
            } else {
                System.out.println("Kode barang tidak valid.");
            }
        }
        System.out.println("================================================================================");
        System.out.println("Total Bayar \t\t\t\t\t\t\t\t\t\t" + totalBayar);
        System.out.println("================================================================================");
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
