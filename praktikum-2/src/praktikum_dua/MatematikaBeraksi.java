package praktikum_dua;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();

        int hasilPertambahan = mtk.pertambahan(20, 10);
        int hasilPengurangan = mtk.pengurangan(10, 5);
        int hasilPerkalian = mtk.perkalian(10, 3);
        int hasilPembagian = mtk.pembagian(21, 2);

        System.out.println("Pertambahan : 20 + 10 = " + hasilPertambahan);
        System.out.println("Pengurangan : 10 - 5 = " + hasilPengurangan);
        System.out.println("Perkalian   : 10 * 3 = " + hasilPerkalian);
        System.out.println("Pembagian   : 21 / 2 = " + hasilPembagian);
    }

}
