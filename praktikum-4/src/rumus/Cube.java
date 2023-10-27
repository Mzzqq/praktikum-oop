package rumus;

import java.lang.Math;
public class Cube extends Geometry{
    private int sisi;
    public Cube(int sisi){
        this.sisi = sisi;
    }

    @Override
    protected double volume(){
        return Math.pow(sisi, 3);
    }

    protected double surfaceArea(){
        return 6 * Math.pow(sisi, 2);
    }
}
