package praktikum_dua;

interface MatematikaInterface {
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    int pembagian(int a, int b);
}

public class Matematika implements MatematikaInterface{
    int hasil;

    public int pertambahan(int a, int b) {
        return hasil = a + b;
    }

    public int pengurangan(int a, int b) {
        return hasil = a - b;
    }

    public int perkalian(int a, int b) {
        return hasil = a * b;
    }

    public int pembagian(int a, int b) {
        return hasil = a / b;
    }

    int getValue() {
        return hasil;
    }
}
