/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg10.pkgclass.inheritance;

/**
 *
 * @author 1609963
 */
public class Box extends Solid {

    private final double width;
    private final double depth;
    private final double height;

    public Box(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return width * depth * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (width * depth + width * height + depth * height);
    }

    @Override
    public String toString() {
        return "Volume : " + getVolume() + " Area : " + getSurfaceArea();
    }

}
