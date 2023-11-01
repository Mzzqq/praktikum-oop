package rumus;

public class Block extends Geometry{
    private int panjang, lebar, tinggi;

    public Block(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    protected int volume(){
        return panjang * lebar * tinggi;
    }

    protected int surfaceArea(){
        return 2 * ((panjang * lebar) + (lebar * tinggi) + (panjang * tinggi));
    }

}
