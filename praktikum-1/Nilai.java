import java.sql.SQLOutput;

public class Nilai {
    String nama;
    String NIM;
    float nilaiAbsen;
    float nilaiTugas;
    float nilaiUts;
    float nilaiUas;

    float Nilai() {
        float values = (float)
                ((this.nilaiAbsen * 0.1) +
                        (this.nilaiTugas * 0.2) +
                        (this.nilaiUts * 0.3) +
                        (this.nilaiUas * 0.4));
        return values;
    }

    void CetakNilai() {
        System.out.println("NIM: " + this.NIM);
        System.out.println("Nama: " + this.nama);
        System.out.println("Nilai Absen[10%]: " + this.nilaiAbsen);
        System.out.println("Nilai Tugas[20%]: " + this.nilaiTugas);
        System.out.println("Nilai UTS[30%]: " + this.nilaiUts);
        System.out.println("Nilai UAS[40%]: " + this.nilaiUas);
        System.out.println("Nilai Akhir: " + Nilai());
    }
}
