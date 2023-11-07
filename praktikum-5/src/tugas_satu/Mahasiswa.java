package tugas_satu;
public class Mahasiswa {
    private String npm;
    private String namaMahasiswa;
    private double nilaiKehadiran;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Mahasiswa(String npm, String namaMahasiswa, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.namaMahasiswa = namaMahasiswa;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double hitungNilaiAkhir() {
        return (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);
    }

    public String getNPM() {
        return npm;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }
}
