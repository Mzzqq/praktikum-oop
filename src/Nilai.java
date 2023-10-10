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
        System.out.printf("NIM\t\t\t: %s\n" +
                "Nama\t\t\t: %s\n" +
                "Nilai Absen[10%]\t\t\t: %f\n" +
                "Nilai Tugas[20%]\t\t\t: %f\n" +
                "Nilai UTS[30%]\t\t\t: %f\n" +
                "Nilai UAS[40%]\t\t\t: %f\n");
    }
}
