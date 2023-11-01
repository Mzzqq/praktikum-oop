package rumus;

import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jenis bangun ruang (balok/kubus): ");
        String jenisBangunRuang = scanner.nextLine();

        if (jenisBangunRuang.equals("balok")){
            System.out.print("Panjang (cm): ");
            int panjang = scanner.nextInt();
            System.out.print("Lebar (cm): ");
            int lebar = scanner.nextInt();
            System.out.print("Tinggi (cm): ");
            int tinggi = scanner.nextInt();

            Block block = new Block(panjang, lebar, tinggi);

            int volumeBalok = block.volume();
            int luasPermukaanBalok = block.surfaceArea();

            System.out.println("Volume balok: " + volumeBalok + " cm³");
            System.out.println("Luas permukaan balok: " + luasPermukaanBalok + " cm²");
        
        } else if (jenisBangunRuang.equals("kubus")) {
            System.out.print("Sisi (cm): ");
            int sisi = scanner.nextInt();

            Cube kubus = new Cube(sisi);

            int volumeKubus = kubus.volume();
            int luasPermukaanKubus = kubus.surfaceArea();

            System.out.println("Volume kubus: " + volumeKubus + " cm³");
            System.out.println("Luas permukaan kubus: " +luasPermukaanKubus + " cm²");

        } else {
            System.out.println("Input jenis bangun ruang tidak valid!");
        }
    }
}
