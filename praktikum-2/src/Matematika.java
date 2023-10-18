interface MatematikaInterface {
    int pertambahan(int a, int b);
    int pengurangan(int a, int b);
    int perkalian(int a, int b);
    int pembagian(int a, int b);
}

public class Matematika implements MatematikaInterface{
    int a, b;

    public int pertambahan(int a, int b) {
        this.a = a;
        this.b = b;

        return a + b;
    }

    public int pengurangan(int a, int b) {
        this.a = a;
        this.b = b;

        return a - b;
    }

    public int perkalian(int a, int b) {
        this.a = a;
        this.b = b;

        return a * b;
    }

    public int pembagian(int a, int b) {
        this.a = a;
        this.b = b;

        return a / b;
    }
}
