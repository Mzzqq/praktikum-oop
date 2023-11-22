package tugas_satu;

public class PrimeAndNot {
    public static void main(String[] args) {
        System.out.println("Deret bilangan prima dan bukan dari 0 - 20");

        for (int i = 0; i <= 20; i++){
            int factor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    factor++;
                }
            }

            if (factor == 2){
                System.out.println("Bilangan Prima:" + i);
            } else {
                System.out.println("Bilangan Bukan Prima:" + i);
            }
        }
    }
}
