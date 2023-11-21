package tugas_satu;

public class GanjilGenap {
    public static void main(String[] args) {
        System.out.println("Deret bilangan ganjil dan genap dari 0 - 20");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Bilangan genap: " + i);
            } else {
                System.out.println("Bilangan ganjil: " + i);
            }
        }
    }
}
