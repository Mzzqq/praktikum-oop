package tugas_tiga;
import java.util.Scanner;

public class Imt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat badan (kg): ");

        int beratBadan = input.nextInt();
        System.out.print("Masukkan tinggi badan (m): ");

        float tinggiBadan = input.nextFloat();
        float imt = beratBadan / (tinggiBadan * tinggiBadan);

        String kriteria;
        if (imt < 18.5) {
            kriteria = "Berat badan kurang";
        } else if (imt <= 24.9) {
            kriteria = "Berat badan ideal";
        } else if (imt <= 29.9) {
            kriteria = "Berat badan lebih";
        } else if (imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat gemuk";
        }

        System.out.println("IMT: " + imt);
        System.out.println("Kriteria: " + kriteria);
    }
}
