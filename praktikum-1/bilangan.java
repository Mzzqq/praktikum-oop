
public class bilangan {
    int pencacah = 0;
    static int nilai;

    public bilangan(int nilai){
        this.nilai = nilai;
        pencacah++;
    }

    public void info(){
        System.out.println("Nilai: " + nilai);
        System.out.println("Pencacah: " + pencacah);
        System.out.println("");
    }
}
