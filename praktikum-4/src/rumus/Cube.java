package rumus;

import java.lang.Math;
public class Cube extends Geometry{
    private int sisi;
    public Cube(int sisi){
        this.sisi = sisi;
    }

    @Override
    protected int volume(){
        return sisi * sisi * sisi;
    }

    protected int surfaceArea(){
        return 6 * (sisi * sisi);
    }
}
