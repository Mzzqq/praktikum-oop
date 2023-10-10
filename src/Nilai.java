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


}
