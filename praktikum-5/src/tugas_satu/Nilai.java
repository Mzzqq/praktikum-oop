package tugas_satu;

public class Nilai {
    public static String tentukanGrade(double nilaiAkhir) {
        if (nilaiAkhir >= 76) {
            return "A";
        } else if (nilaiAkhir >= 66) {
            return "B";
        } else if (nilaiAkhir >= 56) {
            return "C";
        } else if (nilaiAkhir >= 46) {
            return "D";
        } else {
            return "E";
        }
    }

    public static String tentukanKeterangan(double nilaiAkhir) {
        if (nilaiAkhir >= 76) {
            return "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            return "BAIK";
        } else if (nilaiAkhir >= 56) {
            return "CUKUP";
        } else if (nilaiAkhir >= 46) {
            return "KURANG";
        } else {
            return "KURANG SEKALI";
        }
    }
}
