package rumus;

public class Block extends Geometry{
    private int panjang, lebar, tinggi;

    public Block(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    protected double volume(){
        return panjang * lebar * tinggi;
    }

    protected double surfaceArea(){
        return 2 * ((panjang * lebar) + (lebar * tinggi) + (panjang * tinggi));
    }

}
