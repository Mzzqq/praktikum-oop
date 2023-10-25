package praktikum;

import praktikum_dua.Matematika;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        Matematika2 mtk2 = new Matematika2();

        int pertambahan = mtk.pertambahan(20, 10);
        int pengurangan = mtk.pengurangan(10, 5);
        int perkalian = mtk.perkalian(10, 3);
        int pembagian = mtk.pembagian(24, 2);
        int modulus = mtk2.modulus(20, 3);

        System.out.println("Pertambahan: 20 + 10 = " + pertambahan);
        System.out.println("Pengurangan: 10 - 5 = " + pengurangan);
        System.out.println("Perkalian: 10 * 3 = " + perkalian);
        System.out.println("Pembagian: 24 / 2 = " + pembagian);
        System.out.println("Modulus: 20 % 3 = " + modulus);
    }
}
